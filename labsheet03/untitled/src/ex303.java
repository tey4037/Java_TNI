import java.util.Scanner;

public class ex303 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter number 1: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter number 1: ");
        int num3 = scanner.nextInt();

        if (num1 == num2 && num2 == num3) {System.out.println("All number are the same");
        } else  {System.out.println("Are number are not the same");}
    }
}
