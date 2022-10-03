/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke.co.kaps.Utilities;

import java.util.List;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import ke.co.fingerReader.DigitalPersona.DigiFingerReader;
import ke.co.fingerReader.Secugen.SecugenFingerReader;
import ke.co.kaps.App;
import ke.co.kaps.BusinessLogic.DatabaseModels.staff;
import ke.co.kaps.UI.Models.RegistrationType;
import ke.co.kaps.UI.Models.SensorControlType;
import ke.co.qprox.QProxReader;

/**
 *
 * @author KongMagneto
 */
public class UtData {
    public static Image mainIcon = new Image(App.class.getResource("/imgs/menuMain.png").toString());
    //public static Image mainIcon = new Image("/imgs/menuMain.png");
    private static List<staff> totalStaff;
    private static SensorControlType currentControlType;
    public static int totalStaffCount = 0;
    public static SecugenFingerReader fsr;
    public static DigiFingerReader digifsr;
    public static QProxReader proxfsr;
    public static Stage originalOwner;
    public static staff chosenStaff;
    public static staff regStaff;
    public static boolean topUpLoginSuccessfull = false;
    public static boolean paymentSuccessfull = false;
    public static RegistrationType selectRegType;
    public static String operatingSystemValue;

    /**
     * @return the totalStaff
     */
    public static synchronized List<staff> getTotalStaff() {
        return totalStaff;
    }

    /**
     * @param aTotalStaff the totalStaff to set
     */
    public static synchronized void setTotalStaff(List<staff> aTotalStaff) {
        totalStaff = aTotalStaff;
    }

    /**
     * @return the currentControlType
     */
    public static synchronized SensorControlType getCurrentControlType() {
        return currentControlType;
    }

    /**
     * @param aCurrentControlType the currentControlType to set
     */
    public static synchronized void setCurrentControlType(SensorControlType aCurrentControlType) {
        currentControlType = aCurrentControlType;
    }
    
    
}
