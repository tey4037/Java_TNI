import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Lab304 {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#0.00");


        double weightStr = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your weight (kg.):"));

        double heightStr = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your height (cm.):"));

        double heightM = heightStr / 100.0;
        double bmi = weightStr / (heightM * heightM);


        String category;
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi < 25.0) {
            category = "Healthy Weight";
        } else if (bmi < 30.0) {
            category = "Overweight";
        } else {
            category = "Obese";
        }


        JOptionPane.showMessageDialog(
                null,
                "Your BMI is " + df.format(bmi) + "\n" +
                        "BMI result is " + category
        );
    }
}
