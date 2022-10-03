/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke.co.kaps.UI.ViewControllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;

/**
 *
 * @author KongMagneto
 */
public class NetSensorController {
    
    @FXML
    private StackPane mainPane;
    
    @FXML
    private Circle circlePane;    
    
    private boolean sensorState = false;
    
    public NetSensorController(boolean messageState){
        Platform.runLater(()->{
            this.sensorState = messageState;
            setStackState();
        });
        
    }
    
    
    @FXML
    private void initialize(){
        
    }
    
    private void setStackState(){
        if(sensorState){
            circlePane.getStyleClass().clear();
            circlePane.getStyleClass().add("circPositiveMessage");
        }else{
            circlePane.getStyleClass().clear();
            circlePane.getStyleClass().add("circNegativeMessage");
        }
    }
    
}
