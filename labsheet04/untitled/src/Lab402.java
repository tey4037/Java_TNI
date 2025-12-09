
import javax.swing.JOptionPane;

public class Lab402 {
    public static String getMajor(String studentId) {
        String code = studentId.substring(2, 5);

        switch (code) {
            case "131":
                return "Information Technology (IT)";
            case "132":
                return "Multimedia Technology (MT)";
            case "133":
                return "Digital Business Information Technology (BI)";
            case "134":
                return "Digital Technology in Mass Communication (DC)";
            case "135":
                return "Data Science and Data Analytics (DS)";
            default:
                return "Cannot found major";
        }
    }

    public static void main(String[] args) {
        String id;


        while (true) {
            id = JOptionPane.showInputDialog(
                    null,
                    "Enter student-id:",
                    "Input",
                    JOptionPane.QUESTION_MESSAGE
            );

            if (id == null) {
                JOptionPane.showMessageDialog(null, "Canceled.", "Message",
                        JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            id = id.trim();

            if (id.matches("\\d{10}")) {
                break;
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "Student ID must be exactly 10 digits.\nPlease try again.",
                        "Invalid Input",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }

        String major = getMajor(id);
        JOptionPane.showMessageDialog(
                null,
                "Student ID: " + id + "\nMajor: " + major,
                "Message",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}