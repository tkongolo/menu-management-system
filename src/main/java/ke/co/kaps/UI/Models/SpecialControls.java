/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke.co.kaps.UI.Models;

import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

/**
 *
 * @author KongMagneto
 */
public class SpecialControls {
    
    public StackPane[] stackPaneArray;

    public void mainMessage(Label label, String textValue) {
        label.getStyleClass().clear();
        label.getStyleClass().add("welcomeMainLabel");
        label.setText(textValue);
    }

    public void verifyMessage(Label label, String textValue) {
        label.getStyleClass().clear();
        label.getStyleClass().add("welcomeVerifyLabel");
        label.setText(textValue);
    }

    public void positiveMessage(Label label, String textValue) {
        label.getStyleClass().clear();
        label.getStyleClass().add("welcomePositiveLabel");
        label.setText(textValue);
    }

    public void negativeMessage(Label label, String textValue) {
        label.getStyleClass().clear();
        label.getStyleClass().add("welcomeNegativeLabel");
        label.setText(textValue);
    }
    
    public void fingerPrintNorm(StackPane mainPane){
        mainPane.getStyleClass().clear();
        mainPane.getStyleClass().add("fingerMain");
    }
    
    public void fingerPrintVerify(StackPane mainPane){
        mainPane.getStyleClass().clear();
        mainPane.getStyleClass().add("fingerVerify");
    }
    
    public void fingerPrintPositive(StackPane mainPane){
        mainPane.getStyleClass().clear();
        mainPane.getStyleClass().add("fingerFound");
    }
    
    public void fingerPrintNegative(StackPane mainPane){
        mainPane.getStyleClass().clear();
        mainPane.getStyleClass().add("fingerNotFound");
    }
    
    private void stackPaneSelected(StackPane b){
        b.getStyleClass().clear();
        b.getStyleClass().add("SelectedValue");
    }

    private void stackPaneNotSelected(StackPane b){
        b.getStyleClass().clear();
    }

    public void stackPaneChosenColor(StackPane chosenStackPane){
        stackPaneSelected(chosenStackPane);
        for(StackPane stn : stackPaneArray){
            if(!stn.equals(chosenStackPane)){
                stackPaneNotSelected(stn);
            }
        }
    }

    public void stackPaneClear(){
        for(StackPane stn: stackPaneArray){
            stackPaneNotSelected(stn);
        }
    }

}
