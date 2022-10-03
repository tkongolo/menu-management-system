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
public class GuestReceipt {
    
    private String guestName;
    private String guestPin;
    private String receiptNumber;
    private String chosenForMenu;
    private String paidByID;
    private String paidBy;

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getGuestPin() {
        return guestPin;
    }

    public void setGuestPin(String guestPin) {
        this.guestPin = guestPin;
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    public String getChosenForMenu() {
        return chosenForMenu;
    }

    public void setChosenForMenu(String chosenForMenu) {
        this.chosenForMenu = chosenForMenu;
    }

    public String getPaidByID() {
        return paidByID;
    }

    public void setPaidByID(String paidByID) {
        this.paidByID = paidByID;
    }

    public String getPaidBy() {
        return paidBy;
    }

    public void setPaidBy(String paidBy) {
        this.paidBy = paidBy;
    }
}
