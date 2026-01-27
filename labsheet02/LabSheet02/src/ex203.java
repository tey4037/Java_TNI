import javax.swing.*;
import java.text.DecimalFormat;

public class ex203 {
    public static void main(String[] args) {
        final double LECTURE_PRICE  = 1900;
        final double LAB_PRICE = 3500;

        DecimalFormat frm = new DecimalFormat("#,###.00");
        int Lecture_credit = Integer.parseInt(JOptionPane.showInputDialog("Enter Lecture Credit: "));
        int lab_credit = Integer.parseInt(JOptionPane.showInputDialog("Enter Lab Credit: "));

        double lecture_total_price = LECTURE_PRICE * Lecture_credit;
        double lab_total_price = lab_credit * LAB_PRICE;
        double total_price = lab_total_price + lecture_total_price;


        JOptionPane.showMessageDialog(null,
                "Lecture : " + Lecture_credit + " x " + LECTURE_PRICE + " = " + frm.format(lecture_total_price)
        +"\n Lab: " + lab_credit + " x " + LAB_PRICE + " = " + frm.format(lab_total_price)
        +"\n Total Price: " + frm.format(total_price));
    }
}
