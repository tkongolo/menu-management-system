/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke.co.kaps.UI.Models;

import javafx.scene.control.Alert;

/**
 *
 * @author KongMagneto
 */
public class AlertInfo {
    private String title;
    private String header;

    public AlertInfo(String title, String header, String content, Alert.AlertType alertType) {
        this.title = title;
        this.header = header;
        this.content = content;
        this.alertType = alertType;
    }
    private String content;
    private Alert.AlertType alertType;

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the header
     */
    public String getHeader() {
        return header;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @return the alertType
     */
    public Alert.AlertType getAlertType() {
        return alertType;
    }
}
