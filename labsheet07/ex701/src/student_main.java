public class student_main {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Malee";
        s1.id = "2513510079";
        s1.doHomeWork(10);
        s1.ShowStatus();

        s1.doHomeWork(15);
        s1.ShowStatus();

        s1.takeExam(15);
        s1.ShowStatus();
    }
}
