/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke.co.kaps.UI.Models;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import ke.co.kaps.Utilities.UtJobs;

/**
 *
 * @author KongMagneto
 */
public class ReceiptFormats {
    
    public static Printable getGuestReceiptFormat(GuestReceipt receipt) {
        return new Printable() {

            @Override
            public int print(Graphics g, PageFormat pf, int page) throws PrinterException {
                // TODO Auto-generated method stub
                if (page > 0) { /* We have only one page, and 'page' is zero-based */

                    return NO_SUCH_PAGE;
                }

                int x = 5;
                int y = 5;
                int yNext = 10;

                Graphics2D g2d = (Graphics2D) g;
                g2d.translate(pf.getImageableX(), pf.getImageableY());
                /* Now we perform our rendering */

                g.setFont(new Font("Roman", Font.PLAIN, 8));
                g.drawString("", x, y);
                y += yNext;
                g.drawString("     MARS WRIGLEY CONFECTIONERY ", x, y);
                y += yNext;
                g.drawString("  P.O.BOX 30767-00100 NAIROBI KENYA ", x, y);
                y += yNext;
                g.drawString("      TEL. NO.: +254730998000 ", x, y);
                y += yNext;
                g.drawString(" Receipt Number: " + receipt.getReceiptNumber(), x, y);
                y += yNext;
                g.drawString(" ***********************************************", x, y);
                y += yNext;
                g.drawString(" Guest Name : " + receipt.getGuestName(), x, y);
                y += yNext;
                g.drawString(" Guest Pin: " + receipt.getGuestPin(), x, y);
                y += yNext;
                g.drawString("", x, y);
                y += yNext;
                g.drawString(" Menu : " + receipt.getChosenForMenu(), x, y);
                y += yNext;
                g.drawString("", x, y);
                y += yNext;
                g.drawString(" Hosted By", x, y);
                y += yNext;
                g.drawString("", x, y);
                y += yNext;
                g.drawString(" Name: " + receipt.getPaidBy(), x, y);
                y += yNext;
                g.drawString(" Staff ID.: " + receipt.getPaidByID(), x, y);
                y += yNext;
                g.drawString("", x, y);
                y += yNext;
                g.drawString(" ***********************************************", x, y);
                y += yNext;
                g.drawString(" Served By: Menu Management System", x, y);
                y += yNext;
                g.drawString(" " + UtJobs.getNowDateTime(), x, y);
                y += yNext;
                g.drawString("", x, y);
                y += yNext;
                g.drawString("", x, y);
                y += yNext;
                g.drawString("", x, y);
                y += yNext;
                g.drawString("", x, y);
                y += yNext;

                return PAGE_EXISTS;
            }
        };
    }

    public static Printable getStaffReceiptFormat(StaffReceipt receipt) {

        return new Printable() {

            @Override
            public int print(Graphics g, PageFormat pf, int page) throws PrinterException {
                // TODO Auto-generated method stub
                if (page > 0) { /* We have only one page, and 'page' is zero-based */

                    return NO_SUCH_PAGE;
                }

                int x = 5;
                int y = 5;
                int yNext = 10;

                Graphics2D g2d = (Graphics2D) g;
                g2d.translate(pf.getImageableX(), pf.getImageableY());
                /* Now we perform our rendering */

                g.setFont(new Font("Roman", Font.PLAIN, 8));
                g.drawString("", x, y);
                y += yNext;
                g.drawString("     MARS WRIGLEY CONFECTIONERY ", x, y);
                y += yNext;
                g.drawString("  P.O.BOX 30767-00100 NAIROBI KENYA ", x, y);
                y += yNext;
                g.drawString("      TEL. NO.: +254730998000 ", x, y);
                y += yNext;
                g.drawString(" Receipt Number: " + receipt.getReceiptNumber(), x, y);
                y += yNext;
                g.drawString(" ***********************************************", x, y);
                y += yNext;
                g.drawString(" Staff Name : " + receipt.getStaffName(), x, y);
                y += yNext;
                g.drawString(" Staff ID No.: " + receipt.getStaffID(), x, y);
                y += yNext;
                g.drawString(" Department: " + receipt.getDepartment(), x, y);
                y += yNext;
                g.drawString("", x, y);
                y += yNext;
                g.drawString(" Menu : " + receipt.getSelectedMenu(), x, y);
                y += yNext;
                g.drawString("", x, y);
                y += yNext;
                g.drawString(" ***********************************************", x, y);
                y += yNext;
                g.drawString(" Served By: Menu Management System", x, y);
                y += yNext;
                g.drawString(" " + UtJobs.getNowDateTime(), x, y);
                y += yNext;
                g.drawString("", x, y);
                y += yNext;
                g.drawString("", x, y);
                y += yNext;
                g.drawString("", x, y);
                y += yNext;
                g.drawString("", x, y);
                y += yNext;

                return PAGE_EXISTS;
            }
        };
    }

    public static Printable getStaffReceiptPaymentFormat(StaffReceipt receipt) {

        return new Printable() {

            @Override
            public int print(Graphics g, PageFormat pf, int page) throws PrinterException {
                // TODO Auto-generated method stub
                if (page > 0) { /* We have only one page, and 'page' is zero-based */

                    return NO_SUCH_PAGE;
                }

                int x = 5;
                int y = 5;
                int yNext = 10;

                Graphics2D g2d = (Graphics2D) g;
                g2d.translate(pf.getImageableX(), pf.getImageableY());
                /* Now we perform our rendering */

                g.setFont(new Font("Roman", Font.PLAIN, 8));
                g.drawString("", x, y);
                y += yNext;
                g.drawString("     MARS WRIGLEY CONFECTIONERY ", x, y);
                y += yNext;
                g.drawString("  P.O.BOX 30767-00100 NAIROBI KENYA ", x, y);
                y += yNext;
                g.drawString("      TEL. NO.: +254730998000 ", x, y);
                y += yNext;
                g.drawString(" Receipt Number: " + receipt.getReceiptNumber(), x, y);
                y += yNext;
                g.drawString(" ***********************************************", x, y);
                y += yNext;
                g.drawString(" Staff Name : " + receipt.getStaffName(), x, y);
                y += yNext;
                g.drawString(" Staff ID No.: " + receipt.getStaffID(), x, y);
                y += yNext;
                g.drawString("", x, y);
                y += yNext;
                g.drawString(" Menu : " + receipt.getSelectedMenu(), x, y);
                y += yNext;

                g.drawString("", x, y);
                y += yNext;
                g.drawString(" -----------------------------------------------", x, y);
                y += yNext;
                g.drawString("", x, y);
                y += yNext;
                g.drawString(" Amount in Ksh", x, y);
                y += yNext;
                g.drawString("", x, y);
                y += yNext;
                g.drawString(" Total Cost : " + UtJobs.AmountPresent(receipt.getTotalCost()) , x, y);
                y += yNext;
                g.drawString("", x, y);
                y += yNext;
                g.drawString(" Subsidy : " + UtJobs.AmountPresent(receipt.getDiscountAmt()) , x, y);
                y += yNext;
                g.drawString("", x, y);
                y += yNext;
                g.drawString(" " + receipt.getPaymentMethod() + " : " + UtJobs.AmountPresent(receipt.getPaidAmt()), x, y);
                y += yNext;
                g.drawString("", x, y);
                y += yNext;
                g.drawString(" -----------------------------------------------", x, y);
                y += yNext;

                g.drawString("", x, y);
                y += yNext;
                g.drawString(" ***********************************************", x, y);
                y += yNext;
                g.drawString(" Served By: Menu Management System", x, y);
                y += yNext;
                g.drawString(" " + UtJobs.getNowDateTime(), x, y);
                y += yNext;
                g.drawString("", x, y);
                y += yNext;
                g.drawString("", x, y);
                y += yNext;
                g.drawString("", x, y);
                y += yNext;
                g.drawString("", x, y);
                y += yNext;

                return PAGE_EXISTS;
            }
        };
    }
    
}
