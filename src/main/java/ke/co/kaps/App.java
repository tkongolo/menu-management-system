package ke.co.kaps;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;
import ke.co.kaps.UI.Models.FxmlUrl;
import ke.co.kaps.Utilities.UtData;
import ke.co.kaps.Utilities.UtJobs;
import ke.co.kaps.Utilities.UtSettings;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * JavaFX App
 */
public class App extends Application {

    public static Stage splashScreenStage;
    public static UtSettings settings;
    public static final Logger logger = LogManager.getLogger(App.class);
    public static UtData utilitydata;
    
    public App(){

    }

    @Override
    public void start(Stage stage) throws IOException {
        App.splashScreenStage = stage;
        try{
            UtJobs.displayWindowUndecorated(FxmlUrl.WINDOW_SPLASH, 
                    App.splashScreenStage);
        }catch(IOException ex){
            App.logger.error("Could not display splash screen: " 
                    + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        //UtData.operatingSystemValue = System.getProperty("os.name");

        launch();
    }

}