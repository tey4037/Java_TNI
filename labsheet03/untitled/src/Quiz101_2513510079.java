import javax.swing.*;

public class Quiz101_2513510079 {
    public static void main(String[] args) {

        int n;

        while (true) {
            int input = Integer.parseInt(JOptionPane.showInputDialog(
                    null,
                    "Enter an integer")
            );

            if (input <= 1) {
                JOptionPane.showMessageDialog(null, "The number must be greater than 1\nEnter an integer");
                continue;
            }

            long fac = 1;
            String pr = "";
            for (int i = input; i>=1; i--){
                fac *= i;
                pr  += i;
                if (i > 1){
                    pr += " x ";
                }
            }


            JOptionPane.showMessageDialog(null,"Factorial of "+ input +"!"+"\n"+pr+" = "+fac);
        }
    }
}
