import java.util.Scanner;

public class lab204 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hour  : ");
        int Hour = scanner.nextInt();
        System.out.print("Enter minute: ");
        int min = scanner.nextInt();

        int total_time = (Hour*60+min);
        System.out.print("Total time is "+ total_time +" minutes");
    }
}
