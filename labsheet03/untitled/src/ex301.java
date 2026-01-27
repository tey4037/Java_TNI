import javax.swing.*;

public class ex301 {
    public static void main(String[] args) {
        double total_price = Double.parseDouble(JOptionPane.showInputDialog("Enter Total Price"));

        int coupon = JOptionPane.showConfirmDialog(null,"Do You Have Coupon","Coupon",JOptionPane.YES_NO_OPTION);

        if (coupon==JOptionPane.YES_NO_OPTION) {
            int discount_coupon = Integer.parseInt(JOptionPane.showInputDialog("How many Discount (%)"));
            double discount = total_price * discount_coupon / 100;
            double pay = total_price - discount;
            JOptionPane.showMessageDialog(null,"You get discount"+ discount + " bath.\n" + "Total price is "+ pay + " bath.");
        }
        else {
            if (total_price >= 1500){
                double discounts = total_price * 10 /100;
                double pay = total_price - discounts;
                JOptionPane.showMessageDialog(null,"You get disconut 10% ("+ discounts +")\nTotal Price is " + pay + " Bath.");

            }else{
            JOptionPane.showMessageDialog(null,"Total Price is "+ total_price +" Bath   .");
            }
        }
    }
}
