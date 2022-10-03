/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke.co.kaps.UI.Models;

/**
 *
 * @author KongMagneto
 */
public class InfoMessages {
    public static final String ERRORMESSAGE_TITLE_SETTINGS = "Settings Error";
    public static final String ERRORMESSAGE_SYSTEM = "System Error";
    public static final String ERRORMESSAGE_CONTENT_SETTINGS_NOT_FOUND = "Error:"
            + " Settings file not found";
    public static final String ERRORMESSAGE_CONTENT_SETTINGS_MISSING_INFO = "Error: "
            + "Missing information in settings file. Contact Developer for assistance";
    
    public static final String ALERTMESSAGE_TITLE_SUCCESS = "Registration Successfull";
    public static final String ALERTMESSAGE_HEADER_SUCCESS = "You have been registered";
    public static final String ALERTMESSAGE_CONTENT_SUCCESS = "Scan finger on the device to get your menu";
    
    public static final String SPLASH_PROGRESS_LOADSETTINGS = "Loading Settings...";
    public static final String SPLASH_PROGRESS_STARTAPP = "Starting Application...";
    public static final String ERRORMESSAGE_CONTENT_SYSTEM = "Contact Developer for assistance";
    public static final String ERRORMESSAGE_HEADER_DEVICE_SYSTEM = "CARD DEVICE ERROR";
    public static final String GLOB_SYSTEM_ERROR = "SYSTEM ERROR";
    public static final String GLOB_PRINTING_RECEIPT = "PROCESSING: PRINTING RECEIPT...";
    public static final String GLOB_PROCESSING = "PROCESSING...";
    
    public static final String WELCOME_MAIN_MESSAGE_FINGER = "SCAN FINGERPRINT, CARD OR REGISTER";
    public static final String WELCOME_MAIN_MESSAGE_CARD = "SCAN FINGER";
    public static final String WELCOME_NEG_MESSAGE_EMPTYID = "EMPTY ID FIELD. PLEASE ENTER NATIONAL ID";
    public static final String WELCOME_VERIFYING_GLOB = "PROCESSING: VERIFYING...";
    public static final String WELCOME_VERIFYING_ID = "PROCESSING: VERIFYING ID...";
    public static final String WELCOME_VERIFYING_BIOMETRIC = "PROCESSING: VERIFYING BIOMETRIC...";
    public static final String WELCOME_NEG_FINGERNOTFOUND = "BIOMETRIC NOT FOUND";
    public static final String WELCOME_NEG_NATIONALIDNOTFOUND = "NATIONAL ID NOT FOUND";
    public static final String WELCOME_NEG_IDNOTFOUND = "ID NOT FOUND";
    
    public static final String GUEST_MAIN_MESSAGE = "FILL IN THE SPACE BELOW";
    public static final String GUEST_NEG_EMPTY_PIN = "EMPTY PIN FIELD. PLEASE ENTER GUEST PIN";
    public static final String GUEST_VERIFYING_PIN = "PROCESSING: VERIFYING PIN...";
    public static final String GUEST_NEG_PIN_NOT_FOUND = "GUEST PIN NOT FOUND";
    public static final String GUEST_VERIFYING_PIN_TRANSACT = "PROCESSING TRANSACTION...";
    
    public static final String REGISTRATION_MAIN_MESSAGE = "REGISTRATION: PRESS FIRST FINGERPRINT ON SENSOR";
    public static final String REGISTRATION_MAIN_MESSAGE2 = "REGISTRATION: PRESS SECOND FINGERPRINT ON SENSOR";
    public static final String REGISTRATION_VERIFYING = "REGISTRATION: VERIFYING...";
    public static final String REGISTRATION_PROCESS = "REGISTERING...";
    public static final String REGISTRATION_VERIFICATION_FAILED = "REGISTRATION: VERIFICATION FAILED";
    public static final String REGISTRATION_VERIFICATION_ALREADY_REGISTERED = "REGISTRATION: FINGERPRINT ALREADY REGISTERED";
    public static final String REGISTRATION_PROCEED_MENU = "You have been registered. Do you wish to select menu?";
    public static final String REGISTRATION_MAIN_MESSAGE_AGAIN = "REGISTRATION: PRESS FIRST FINGERPRINT ON SENSOR AGAIN";
    public static final String REGISTRATION_MAIN_MESSAGE2_AGAIN = "REGISTRATION: PRESS SECOND FINGERPRINT ON SENSOR AGAIN";
    
    public static final String REGISTRATIONCARD_MAIN_MESSAGE = "REGISTRATION: SCAN FINGERPRINT";
    public static final String REGISTRATIONCARD_MAIN_CARDREG = "REGISTRATION: TAP CARD";
    
    public static final String REGISTRATIONCARD_CONFIRMATION = "Do you wish to register the card details?";
    
    public static final String REGISTRATION_getFPRegistration1Again(int n){
        return "REGISTRATION: PRESS FIRST FINGERPRINT AGAIN. "
                + "REMAINING: " + Integer.toString(n);
    }
    
    public static final String REGISTRATION_getFPRegistration2Again(int n){
        return "REGISTRATION: PRESS SECOND FINGERPRINT AGAIN. "
                + "REMAINING: " + Integer.toString(n);
    }
    
    public static final String MENU_LOADINGMENU_MESSAGE = "LOADING AVAILABLE MENU...";
    public static final String MENU_LOADINGMENU_NO_MENU = "NO MENU AT THIS TIME";
    public static final String MENU_LOADINGMENU_NO_MENU_VALID = "CANNOT SERVE "
            + "MENU AT THIS TIME. PLEASE TRY AGAIN LATER";
    public static final String MENU_NOMENUSELECTED = "PLEASE SELECT MENU";
    
    public static final String MENU_getTakeOrderLabel(String incompleteName){
        return "PLEASE TAKE YOUR ORDER " + incompleteName;
    }
    
    public static final String MENU_getTitleLabel(String name){
        String[] namesplit = name.split(" ");
        if (namesplit.length > 1) {
            String firstName = namesplit[0];
            String secondName = namesplit[namesplit.length - 1];
            String first2 = firstName.substring(1);
            String newFirst = firstName.charAt(0) + first2.toLowerCase();
            String fullName = newFirst + " " + secondName.charAt(0) + ".";
            return fullName.toUpperCase();
        } else {
            return name.toUpperCase();
        }
    }
    
     
}
