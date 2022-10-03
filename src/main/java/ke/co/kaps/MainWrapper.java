/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke.co.kaps;

import java.lang.reflect.Method;

/**
 *
 * @author KongMagneto
 */
public class MainWrapper {
    
    public static void main(String[] args)throws Exception{
        Class<?> app = Class.forName("ke.co.kaps.App");
        Method main = app.getDeclaredMethod("main", String[].class);
        System.setProperty("com.sun.javafx.isEmbedded","true");
        System.setProperty("com.sun.javafx.virtualKeyboard","javafx");
        System.setProperty("com.sun.javafx.touch","true");
        Object[] arguments = new Object[]{args};
        main.invoke(null, arguments);
    }
    
}
