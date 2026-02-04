import java.util.Scanner;

public class Cakeorder{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Birthday cake's Details");
        System.out.print("Enter a message on cake : ");
        String message = scanner.next();
        System.out.print("Enter flavor : ");
        String flavor = scanner.next();
        System.out.print("How many pound : ");
        double pound = scanner.nextDouble();
        System.out.println();
        Birthdaycake order1 = new Birthdaycake(message,pound,flavor,350);
        System.out.println(order1);

        System.out.println();

        System.out.println("Cupcake's Details");
        System.out.print("Enter a message on cupcake : ");
        String cupcake_messages = scanner.next();
        System.out.print("Enter flavor : ");
        String cupcake_flavors = scanner.next();

        System.out.print("How many piece : ");
        int piece = scanner.nextInt();
        cupcake order2 =new cupcake(piece,flavor,65);

        System.out.println();
        System.out.println(order2);
        System.out.print("Total price = " + (order1.getUnitprice()*pound + order2.getUnitprice()*piece));

        System.out.println();
        System.out.println();

        System.out.println("Wings detail");
        System.out.print("Enter Spicy level : ");
        String spicy_level = scanner.next();
        System.out.print("Wing's Flavor : ");
        String flavors = scanner.next();
        System.out.print("How many wings : ");
        int wings = scanner.nextInt();

        chicken od1 = new chicken(wings,spicy_level,flavors,25.0);
        System.out.println(od1);
        System.out.print("Total price = " + (order1.getUnitprice()*pound + order2.getUnitprice()*piece + od1.calculatetotalprice()));
    }
}
