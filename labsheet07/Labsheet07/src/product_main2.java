import java.util.Scanner;
public class product_main2 {
    public static void main(String[] args) {
        product product1 = new product();
        product1.name = "Pens";
        product1.price = 10.5;
        product1.quantity = 50;

        product product2 = new product();
        product2.name = "Notebooks";
        product2.price = 25.75;
        product2.quantity = 20;

        System.out.println("welcome to Mini shop");
        System.out.println("--------------------------------");
        System.out.println("Press [1] to buy Pen");
        System.out.println("Press [2] to buy Notebook");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");
            int amount = sc.nextInt();

            if (amount == 1) {
                System.out.println("Name : Pens");
                System.out.println("Price : " + product1.price + " Baht/Item");
                System.out.println("Stock : " + product1.quantity + " Baht/Item");
                System.out.println("Stock Value : " + product1.quantity * product1.price + " Baht/Item");
                System.out.println("-------------------------------------");

                System.out.println("How many Pens do you want to buy?");
                int buy = sc.nextInt();

                System.out.println("Sold " + buy + " items");
                System.out.println("-------------------------------------");
                product1.showinfo();
                break;
            } else if (amount == 2) {
                System.out.println("Name : Notebooks");
                System.out.println("Price : " + product2.price + " Baht/Item");
                System.out.println("Stock : " + product2.quantity + " Baht/Item");
                System.out.println("Stock Value : " + product2.quantity * product2.price + " Baht/Item");

                System.out.println("How many Pens do you want to buy?");
                int buy = sc.nextInt();

                System.out.println("Sold " + buy + " items");
                System.out.println("-------------------------------------");
                product2.showinfo();
                break;
            } else {
                System.out.print("Invalid number! Enter a number, again: ");
            }
        }
    }
}
