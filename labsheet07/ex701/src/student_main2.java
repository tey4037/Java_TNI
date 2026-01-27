import java.util.Scanner;

public class student_main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        student[] st = new student[10];

        for (int i=0; i<st.length; i++) {
            st[i] = new student();
            System.out.print("Enter student name : ");
            st[i].name = scanner.next();
            System.out.print("Enter Studennt id : ");
            st[i].id = scanner.next();

            System.out.print("Enter homework score : ");
            int homework_score = scanner.nextInt();
            st[i].doHomeWork(homework_score);

            System.out.print("Enter exam score : ");
            st[i].takeExam(scanner.nextInt());
        }
        for (student s : st){
            System.out.println();
            s.ShowStatus();
        }
    }
}
