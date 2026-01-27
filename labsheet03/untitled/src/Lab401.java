import javax.swing.*;

public class Lab401 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null,"Enter Yours Full name:");

        if (input == null || input.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Invalid Input");
            return;
        }


    }
}
