import java.util.Scanner;

public class Lab301 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.close();
            return;
        }

        int n = scanner.nextInt();
        scanner.close();

        if (n == 0) {
            System.out.println("This is Zero number.");
            return;
        }
        boolean Even = (n % 2 == 0);
        boolean Positive = (n > 0);
        if (Even && Positive) {
            System.out.println("This number is Even and Positive number.");
        } else if (Even && !Positive) {
            System.out.println("This number is Even and Negative number.");
        } else if (!Even && Positive) {
            System.out.println("This number is Odd and Positive number.");
        } else {
            System.out.println("This number is Odd and Negative number.");
        }
    }
}