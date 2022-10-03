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
public class AlertMessages {
    public static final AlertInfo NO_SETTINGS_ERROR = new AlertInfo(InfoMessages.ERRORMESSAGE_TITLE_SETTINGS,
        null, InfoMessages.ERRORMESSAGE_CONTENT_SETTINGS_NOT_FOUND, Alert.AlertType.ERROR);
    public static final AlertInfo SETTINGS_MISSING_INFO = new AlertInfo(InfoMessages.ERRORMESSAGE_TITLE_SETTINGS,
        null, InfoMessages.ERRORMESSAGE_CONTENT_SETTINGS_MISSING_INFO, Alert.AlertType.ERROR);
    public static final AlertInfo SYSTEM_ERROR = new AlertInfo(InfoMessages.ERRORMESSAGE_SYSTEM, null,
        InfoMessages.ERRORMESSAGE_CONTENT_SYSTEM, Alert.AlertType.ERROR);
    public static final AlertInfo QPROX_SYSTEM_ERROR = new AlertInfo(InfoMessages.ERRORMESSAGE_SYSTEM, 
            InfoMessages.ERRORMESSAGE_HEADER_DEVICE_SYSTEM, InfoMessages.ERRORMESSAGE_CONTENT_SYSTEM,
            Alert.AlertType.ERROR);
    
    public static final AlertInfo REG_SUCCESS = new AlertInfo(InfoMessages.ALERTMESSAGE_TITLE_SUCCESS, 
            InfoMessages.ALERTMESSAGE_HEADER_SUCCESS, InfoMessages.ALERTMESSAGE_CONTENT_SUCCESS, Alert.AlertType.INFORMATION);
    
}
