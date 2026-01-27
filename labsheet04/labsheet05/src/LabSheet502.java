import javax.swing.*;

public class LabSheet502 {

    public static String find_grade(int score) {
        if (score >= 80 && score <= 100) {
            return "A";
        } else if (score >= 70) {
            return "B";
        } else if (score >= 60){
            return "C";
        } else if (score>= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public static int cal_score(int midterm,int Final){
        return midterm + Final;
    }

    public static int input_socre(String message,int limit_score){
        int socre;
        while (true){
            socre = Integer.parseInt(JOptionPane.showInputDialog(message));
            if (socre >= 0 && socre <= limit_score){
                return socre;
            }
            JOptionPane.showInputDialog(null,"Score must be between 0 and "+ limit_score);
        }
    }


    public static void main(String[] args) {
        while (true){
            int confirm = JOptionPane.showConfirmDialog(null,"do you want to check score");
            if (confirm != JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null,"END PROGRAM");
                break;
            }
            int mid = input_socre("Enter Midterm score (0-45)",45);
            int Final=  input_socre("Enter Final score (0-55)",55);

            int total = cal_score(mid,Final);
            String grade = find_grade(total);

            JOptionPane.showMessageDialog(null,"Total socre = "+ total + "\nGrade = " + grade);

        }
    }
}
