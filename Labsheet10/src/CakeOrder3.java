import javax.swing.*;


public class CakeOrder3 {
    public static void main(String[] args) {
        String strpound = JOptionPane.showInputDialog(
                null,
                "How many pounds do you want?"
        );
        if (strpound== null) return;
        double pound = Double.parseDouble(strpound);

        String flavor = JOptionPane.showInputDialog(
                null,
                "Enter a flavor birthday cake:"
        );
        if (flavor == null) return;

        String message = JOptionPane.showInputDialog(
                null,
                "Enter a message on cake:"
        );
        if (message == null) return;

        Birthdaycake cake = new Birthdaycake(message, pound, flavor, 400);

        while (true) {

            int option = JOptionPane.showConfirmDialog(
                    null,
                    cake.toString() + "\n\nConfirm this order?",
                    "Select an Option",
                    JOptionPane.YES_NO_CANCEL_OPTION
            );

            if (option == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(
                        null,
                        cake.toString()
                );
                break;

            } else if (option == JOptionPane.NO_OPTION) {
                String newMsg = JOptionPane.showInputDialog(
                        null,
                        "Enter a new message for changing:",
                        cake.getMessage()
                );
                if (newMsg == null) return;

                cake.changeMessage(newMsg);

            } else {
                break;
            }
        }
    }
}
