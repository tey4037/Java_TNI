import javax.swing.*;

public class lab205 {
    public static void main(String[] args) {
        int total_minutes = Integer.parseInt(JOptionPane.showInputDialog("Input minutes:"));
        int hours = (total_minutes/60);
        int min = (total_minutes%60);
        JOptionPane.showMessageDialog(null,total_minutes+" minutes is " + hours + " hour " + min +" minute");
    }
}
