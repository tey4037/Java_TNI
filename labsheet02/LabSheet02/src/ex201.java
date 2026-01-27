public class ex201 {
    public static void main(String[] args) {
        String Product_name = "PB-001";
        String name = "Pecil Box";
        int Item = 112;
        double price_per_item = 30.20;

        System.out.println("Product name " + name + (" ("+ Product_name + ")") );
        System.out.println("Product name " + Item + "(" + price_per_item + "bath/price)");

        double total_price = Item * price_per_item;
        System.out.println("total price :" + total_price + "bath");
    }
}