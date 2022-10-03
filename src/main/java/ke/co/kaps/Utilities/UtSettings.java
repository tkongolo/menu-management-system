/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke.co.kaps.Utilities;

import ke.co.kaps.UI.Models.SensorType;

/**
 *
 * @author KongMagneto
 */
public class UtSettings {
    
    private String dbUser;
    private String dbPassword;
    private String dbHost;
    private String dbPort;
    private String dbName;
    private String printerName;
    private boolean payment;
    private boolean topUp;
    private String paybillNumber;
    private String qproxPort;
    private SensorType sensorType;

    public void setSensorType(SensorType sensorType) {
        this.sensorType = sensorType;
    }

    public SensorType getSensorType() {
        return sensorType;
    }

    /**
     * @return the dbUser
     */
    public String getDbUser() {
        return dbUser;
    }

    /**
     * @param dbUser the dbUser to set
     */
    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    /**
     * @return the dbPassword
     */
    public String getDbPassword() {
        return dbPassword;
    }

    /**
     * @param dbPassword the dbPassword to set
     */
    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    /**
     * @return the dbHost
     */
    public String getDbHost() {
        return dbHost;
    }

    /**
     * @param dbHost the dbHost to set
     */
    public void setDbHost(String dbHost) {
        this.dbHost = dbHost;
    }

    /**
     * @return the dbPort
     */
    public String getDbPort() {
        return dbPort;
    }

    /**
     * @param dbPort the dbPort to set
     */
    public void setDbPort(String dbPort) {
        this.dbPort = dbPort;
    }

    /**
     * @return the dbName
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * @param dbName the dbName to set
     */
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    /**
     * @return the printerName
     */
    public String getPrinterName() {
        return printerName;
    }

    /**
     * @param printerName the printerName to set
     */
    public void setPrinterName(String printerName) {
        this.printerName = printerName;
    }

    /**
     * @return the payment
     */
    public boolean isPayment() {
        return payment;
    }

    /**
     * @param payment the payment to set
     */
    public void setPayment(boolean payment) {
        this.payment = payment;
    }

    /**
     * @return the topUp
     */
    public boolean isTopUp() {
        return topUp;
    }

    /**
     * @param topUp the topUp to set
     */
    public void setTopUp(boolean topUp) {
        this.topUp = topUp;
    }

    /**
     * @return the paybillNumber
     */
    public String getPaybillNumber() {
        return paybillNumber;
    }

    /**
     * @param paybillNumber the paybillNumber to set
     */
    public void setPaybillNumber(String paybillNumber) {
        this.paybillNumber = paybillNumber;
    }

    /**
     * @return the qproxPort
     */
    public String getQproxPort() {
        return qproxPort;
    }

    /**
     * @param qproxPort the qproxPort to set
     */
    public void setQproxPort(String qproxPort) {
        this.qproxPort = qproxPort;
    } 
}
