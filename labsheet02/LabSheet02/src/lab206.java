import javax.swing.*;
import  java.text.DecimalFormat;
public class lab206 {
    public static void main(String[] args) {
        int food = 299;
        int total_Customers = Integer.parseInt(JOptionPane.showInputDialog("How many customer?"));
        DecimalFormat frm = new DecimalFormat("###.00");

        double price_net = (total_Customers*food*1.07);
        double coupon = Double.parseDouble(JOptionPane.showInputDialog("Price with NET is " +frm.format(price_net) + " bath."+
                "\nHow much of discount (%) on your coupon"));

        double discount_price = price_net-(price_net*(coupon/100));
        double customer_paid = Double.parseDouble(JOptionPane.showInputDialog("Total price is " +frm.format(discount_price) + " bath."+
                "\nEnter the amount the customer paid:"));

        JOptionPane.showInputDialog("Total price is "+ frm.format(discount_price) + " bath." + "\nCustomer paid " + customer_paid +" bath." +"\nGet Change " + frm.format(customer_paid-discount_price));
    }
}
