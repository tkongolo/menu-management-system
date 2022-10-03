/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke.co.kaps.Utilities;

import java.awt.image.BufferedImage;
import java.awt.print.Printable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.InetAddress;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import ke.co.cipher.CipherUtilsNew;
import ke.co.kaps.App;
import ke.co.kaps.UI.Models.AlertInfo;
import ke.co.kaps.UI.Models.AlertMessages;
import ke.co.kaps.UI.Models.FxmlUrl;
import ke.co.kaps.UI.Models.SensorType;
import ke.co.kaps.UI.Models.TimeInfo;
import ke.co.kaps.UI.ViewControllers.DBSensorController;
import ke.co.kaps.UI.ViewControllers.FPSensorController;
import ke.co.kaps.UI.ViewControllers.NetSensorController;
import ke.co.printerapi.Driver.DriverPrinter;

/**
 *
 * @author KongMagneto
 */
public class UtJobs {

    public static String getDBUrl(String dbHost, String dbPort, String dbName) {
        return "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName
                + "?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    }

    //settings
    private static FileInputStream getSettingsStream() {
        FileInputStream f;
        try {
            f = new FileInputStream("settings.properties");
            return f;
        } catch (FileNotFoundException e) {
            App.logger.error("Settings file not found");
            return null;
        }
    }

    public static void setSettings() {
        FileInputStream s = getSettingsStream();
        if (s != null) {
            Properties pros = new Properties();
            try {
                pros.load(s);

                App.settings = new UtSettings();
                App.settings.setDbUser(CipherUtilsNew.decrypt(pros.getProperty("dbUser")));
                App.settings.setDbPassword(CipherUtilsNew.decrypt(pros.getProperty("dbPassword")));
                App.settings.setDbHost(CipherUtilsNew.decrypt(pros.getProperty("dbHost")));
                App.settings.setDbName(CipherUtilsNew.decrypt(pros.getProperty("dbName")));
                App.settings.setDbPort(CipherUtilsNew.decrypt(pros.getProperty("dbPort")));
                App.settings.setPrinterName(CipherUtilsNew.decrypt(pros.getProperty("printerName")));
                App.settings.setPaybillNumber(pros.getProperty("paybillNumber"));
                App.settings.setQproxPort(pros.getProperty("comport"));
                App.settings.setSensorType(getSensorType(pros.getProperty("sensorType")));
                String payment = pros.getProperty("payment");
                String topUp = pros.getProperty("topUp");
                String tPhase = pros.getProperty("tPhase");
                App.settings.setPayment(payment.equals("1"));
                App.settings.setTopUp(topUp.equals("1"));

            } catch (IOException ex) {
                App.logger.error("Missing settings info: "
                        + ex.getMessage());
                generateAlert(AlertMessages.SETTINGS_MISSING_INFO);
                System.exit(1);

            }
        } else {
            App.logger.error("Settings file empty");
            generateAlert(AlertMessages.NO_SETTINGS_ERROR);
            System.exit(1);
        }
    }

    private static SensorType getSensorType(String sensorValue) {
        SensorType res = null;
        switch (sensorValue) {
            case "2":
                res = SensorType.DIGIFINGER;
                break;
            case "3":
                res = SensorType.QPROX;
                break;
            default:
                res = SensorType.SECUGEN;
                break;
        }

        return res;
    }

    public static void generateAlert(AlertInfo alertInfo) {
        Alert alert = new Alert(alertInfo.getAlertType());
        alert.setTitle(alertInfo.getTitle());
        alert.setHeaderText(alertInfo.getHeader());
        alert.setContentText(alertInfo.getContent());

        alert.showAndWait();
    }

    public static Task<Void> delayTask(int delayTime) {
        return new Task<Void>() {
            @Override
            protected Void call() {
                try {
                    Thread.sleep(delayTime);
                } catch (InterruptedException ex) {
                }

                return null;
            }

        };
    }

    public static void threadSleep(long value) {
        try {
            Thread.sleep(value);
        } catch (InterruptedException ex) {
            //App.logger.error("Threading sleep error");
        }
    }

    public static void displayWindowUndecorated(String url, Stage stage) throws IOException {

        FXMLLoader loader = new FXMLLoader(App.class.getResource(url));
        Parent root = (Parent) loader.load();
        Scene startupScene = new Scene(root);
        stage.getIcons().add(UtData.mainIcon);
        stage.setScene(startupScene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();

    }
    
    public static void displayWindowUndecoratedAndWait(String url, Stage stage) throws IOException {

        FXMLLoader loader = new FXMLLoader(App.class.getResource(url));
        Parent root = (Parent) loader.load();
        Scene startupScene = new Scene(root);
        stage.getIcons().add(UtData.mainIcon);
        stage.setScene(startupScene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.showAndWait();

    }

    public static void displaySensorInfo(String url, StackPane selectedPane,
            boolean checkerState) {
        Object s = null;
        switch (url) {
            case FxmlUrl.PANE_SENSOR_DB:
                s = new DBSensorController(checkerState);
                break;
            case FxmlUrl.PANE_SENSOR_FP:
                s = new FPSensorController(checkerState);
                break;
            case FxmlUrl.PANE_SENSOR_NET:
                s = new NetSensorController(checkerState);
                break;
            default:
                break;
        }

        if (s != null) {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(App.class.getResource(url));
                loader.setController(s);
                StackPane namePane = (StackPane) loader.load();
                selectedPane.getChildren().setAll(namePane);
            } catch (IOException ex) {
                App.logger.error("Could not load sensor url: " + ex.getMessage());
            }
        }

    }

    public static void displayPartMain(String url, StackPane selectedPane) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource(url));
            StackPane namePane = (StackPane) loader.load();
            selectedPane.getChildren().setAll(namePane);
        } catch (IOException ex) {
            ex.printStackTrace();
            App.logger.error("Could not load partMain url: " + url + ": "
                    + ex.getMessage());

        }
    }

    public static TimeInfo getTopDateTime() {

        TimeInfo res = null;
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter top = DateTimeFormatter.ofPattern("EEEE dd-MM-yyyy");
        DateTimeFormatter bottom = DateTimeFormatter.ofPattern("HH:mm:ss a");
        String sTop = now.format(top);
        String bTop = now.format(bottom);

        res = new TimeInfo(sTop, bTop);

        return res;
    }

    public static boolean sendPingRequest() {
        boolean res = false;

        try {
            InetAddress inetAddress = InetAddress.getByName("185.148.145.77");
            if (inetAddress.isReachable(3000)) {
                res = true;
            }
        } catch (IOException ex) {
            App.logger.info("Exception in pinging: " + ex.getMessage());
        }

        return res;
    }

    public static boolean IsEmptyOrNull(String textValue) {
        boolean res = false;

        if (textValue == null || textValue.isEmpty()) {
            res = true;
        }

        return res;
    }

    public static String getNowDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return now.format(formatter);
    }

    public static String AmountPresent(double amount) {
        String amountString = Double.toString(amount);
        return "Ksh. " + amountString;
    }

    public static Task<Void> printReceipt(Printable receiptPrintable) {
        return new Task<Void>() {

            @Override
            protected Void call() throws Exception {
                // TODO Auto-generated method stub
                DriverPrinter receiptPrinter = new DriverPrinter();
                receiptPrinter.printReceipt(receiptPrintable,
                        App.settings.getPrinterName());

                return null;
            }

        };
    }

    public static WritableImage convertToJfxImage(BufferedImage fingerprintImage) {
        WritableImage wr = null;
        wr = SwingFXUtils.toFXImage(fingerprintImage, null);
        return wr;
    }

}
