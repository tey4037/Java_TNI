import javax.swing.JOptionPane;

public class Lab302 {
    public static void main(String[] args) {

        String firstName = JOptionPane.showInputDialog(null, "Enter your first name:");

        int height = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your height (cm)"));

        int Male = JOptionPane.showConfirmDialog(
                null,
                "Are your biological gender is Male?",
                "Gender",
                JOptionPane.YES_NO_OPTION
        );

        if (Male == JOptionPane.YES_OPTION) {
            int idealWeight = height - 100;
            JOptionPane.showMessageDialog(
                    null,
                    "Hello, Mr. " + firstName + "\n"
                            + "If your height is " + height + " cm.\n"
                            + "Your weight should be " + idealWeight + " kg."
            );
            return;
        }

        int Female = JOptionPane.showConfirmDialog(
                null,
                "Are your biological gender is Female?",
                "Gender",
                JOptionPane.YES_NO_OPTION
        );

        if (Female == JOptionPane.YES_OPTION) {
            int idealWeight = height - 110;
            JOptionPane.showMessageDialog(
                    null,
                    "Hello, Ms. " + firstName + "\n"
                            + "If your height is " + height + " cm.\n"
                            + "Your weight should be " + idealWeight + " kg."
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "You can use BMI to measure your weight and height."
            );
        }
    }
}
