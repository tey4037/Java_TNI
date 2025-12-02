import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Lab307 {
    public static void main(String[] args) {
        double total = 0.0;
        DecimalFormat df = new DecimalFormat("#0.00"); // แสดงทศนิยม 2 ตำแหน่ง (เช่น 300.00)

        while (true) {
            String input = JOptionPane.showInputDialog(
                    null,
                    "Input price (press 0 to stop):"
            );


            if (input.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Invalid price!!");
                continue;
            }

            double price = Double.parseDouble(input);


            if (price < 0) {
                JOptionPane.showMessageDialog(null, "Invalid price!!");
                continue;
            } else if (price == 0) {
                break;
            } else {
                total += price;
            }
        }

        JOptionPane.showMessageDialog(
                null,
                "Total price is " + df.format(total) + " baht."
        );
    }
}
