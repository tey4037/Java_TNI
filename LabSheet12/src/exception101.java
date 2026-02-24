import java.util.InputMismatchException;
import java.util.Scanner;

public class exception101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        try {
            System.out.println("Enter Integer");
            number = sc.nextInt();
        } catch (InputMismatchException err){
                System.out.println(err.getMessage());
        }


        System.out.println("You input number = " + number);
    }
}
