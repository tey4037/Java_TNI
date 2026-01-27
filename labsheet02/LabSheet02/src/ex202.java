import java.util.Scanner;

public class ex202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Id");
        String id = scanner.next();

        scanner.nextLine();
        System.out.print("Enter Student name: ");

        String name = scanner.nextLine();
        System.out.println("\nStudent Id: "+ id);
        System.out.println("Student name: "+ name);
    }
}
