import java.util.Scanner;

public class Cakeorder{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Birthday cake's Details");

        System.out.println("Enter a message on cake : ");
        String message = scanner.nextLine();
        System.out.println("Enter flavor : ");
        String flavor = scanner.next();
        System.out.println("How many pound : ");
        double pound = scanner.nextDouble();

        Birthdaycake order1 = new Birthdaycake(message,pound,flavor,350);
        System.out.println(order1);

        System.out.println("");

        System.out.println("Cupcake's Details");

        System.out.println("Enter a message on cake : ");
        String cupcake_messages = scanner.nextLine();
        System.out.println("Enter flavor : ");
        String cupcake_flavors = scanner.next();
        System.out.println("How many piece : ");
        int piece = scanner.nextInt();

        cupcake order2 =new cupcake(piece,flavor,65);
        System.out.println(order2);
        System.out.print("Total price = " + (order1.getUnitprice()*pound + order2.getUnitprice()*piece));

        System.out.println("");
        System.out.println("");

        System.out.println("Wings detail");
        System.out.println("Enter Spicy level : ");
        String spicy_level = scanner.next();
        System.out.println("How many wings : ");
        int wings = scanner.nextInt();

        chicken od1 = new chicken(wings,10,spicy_level);
        System.out.println(od1);
        System.out.print("Total price = " + (order1.getUnitprice()*pound + order2.getUnitprice()*piece + od1.totalprice()));
    }
}
