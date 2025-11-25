import java.util.Scanner;

public class lab202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number 1 : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter Number 2 : ");
        int num2 = scanner.nextInt();
        System.out.println("");
        System.out.println("");
        System.out.println("Summation = " +(num1+num2));
        System.out.println("Subtraction = " +(num1-num2));
        System.out.println("Multiplication = " +(num1*num2));
        System.out.println("Division = " +  (float)num1/num2);
        System.out.println("Modulus = " +(num1%num2));
    }
}
