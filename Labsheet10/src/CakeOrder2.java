import java.util.Scanner;

public class CakeOrder2 {
    public static String selectFlavor() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Press 1 for Chocolate");
            System.out.println("Press 2 for Vanilla");
            System.out.println("Press 3 for Strawberry");
            System.out.println("Press 4 for Lemon");
            System.out.println("Press 5 for Red Velvet");
            System.out.print("Enter a flavor number: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                return "Chocolate";
            } else if (choice == 2) {
                return "Vanilla";
            } else if (choice == 3) {
                return "Strawberry";
            } else if (choice == 4) {
                return "Lemon";
            } else if (choice == 5) {
                return "Red Velvet";
            } else {
                System.out.println("Try again\n");
            }
        }
    }
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        System.out.println();
        System.out.println("Press 1 to order birthday cake");
        System.out.println("Press 2 to order Cupcake");
        System.out.println("Press 3 to order Chicken Wings");
        System.out.print("Selcet An Option : ");

        int Option = scaner.nextInt();
        System.out.println();
        if (Option == 1){

            System.out.println("Birthday cake's Details");
            System.out.println();
            String flavor = selectFlavor();
            System.out.println();
            System.out.print("Enter a message on cake : ");
            String message = scaner.next();
            System.out.print("How many pound : ");
            double pound = scaner.nextDouble();
            System.out.println();
            Birthdaycake order1 = new Birthdaycake(message,pound,flavor,350);
            System.out.println(order1);

        } else if (Option == 2) {

            System.out.println("Cupcake's Details");
            System.out.println();
            String flavor = selectFlavor();
            System.out.println();
            System.out.print("Enter a message on cupcake : ");
            String cupcake_messages = scaner.next();
            System.out.print("How many piece : ");
            int piece = scaner.nextInt();
            cupcake order2 =new cupcake(piece,flavor,70);
            System.out.println();
            System.out.println(order2);

        } else if (Option == 3) {
            System.out.println("Wings detail");
            System.out.println();
            System.out.println("Press 1 for Mild Spicy");
            System.out.println("Press 2 for Normal Spicy");
            System.out.println("Press 3 for Extra Spicy");
            System.out.print("Enter Spicy level : ");
            String spicy_level = scaner.next();
            System.out.print("How many wings : ");
            int wings = scaner.nextInt();

            chicken od1 = new chicken(wings,spicy_level,"Classic",25.0);
            System.out.println();
            System.out.println(od1);
        }
    }
}
