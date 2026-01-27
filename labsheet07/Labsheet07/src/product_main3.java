public class product_main3 {
    public static void main(String[] args) {
        product[] products = new product[4];
        setting_product(products);

        for (product product : products) {
            System.out.println("Name : " + product.name);
            System.out.println("Price : " + product.price + " Baht/Item");
            System.out.println("Stock : " + product.quantity + " Item");
            System.out.println("Stock Value : " + product.StockValue() + " Baht");
            System.out.println("-------------------------");
        }
    }

    public static void setting_product(product... products) {
        String[] names = {"Pens", "Pencils", "Markers", "Highlighters"};
        double[] prices = {25.5, 17.25, 30, 35};
        int[] quantities = {20, 35, 10, 40};
        for (int i = 0; i < products.length; i++) {
            products[i] = new product();
            products[i].name = names[i];
            products[i].price = prices[i];
            products[i].quantity = quantities[i];
        }
    }
}