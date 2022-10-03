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
public class StaffReceipt {
    
    private String staffName;
    private String receiptNumber;
    private String paymentMethod;
    private String staffID;
    private String selectedMenu;
    private double totalCost;
    private double discountAmt;
    private double paidAmt;
    private String department;

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getSelectedMenu() {
        return selectedMenu;
    }

    public void setSelectedMenu(String selectedMenu) {
        this.selectedMenu = selectedMenu;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public double getDiscountAmt() {
        return discountAmt;
    }

    public void setDiscountAmt(double discountAmt) {
        this.discountAmt = discountAmt;
    }

    public double getPaidAmt() {
        return paidAmt;
    }

    public void setPaidAmt(double paidAmt) {
        this.paidAmt = paidAmt;
    }
    
}
