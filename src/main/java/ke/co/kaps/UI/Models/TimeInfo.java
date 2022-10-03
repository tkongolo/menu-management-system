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
public class TimeInfo {
    
    private final String topTime;
    private final String bottomTime;
    
    public TimeInfo(String t, String b){
        this.topTime = t;
        this.bottomTime = b;
    }

    /**
     * @return the topTime
     */
    public String getTopTime() {
        return topTime;
    }

    /**
     * @return the bottomTime
     */
    public String getBottomTime() {
        return bottomTime;
    }
    
    
    
}
