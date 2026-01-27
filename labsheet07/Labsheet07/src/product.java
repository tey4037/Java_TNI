public class product {
    String name;
    double price;
    int quantity;

    public void addStock(int amount){
        if (amount > 0){
            quantity += amount;
            System.out.println("added " + amount + " item to stock");
        }
    }
    public void Sell(int amount){
        if (amount < quantity){
            System.out.println("Sold" + amount + " items");
        } else if (amount > quantity) {
            System.out.println("Not enough items in stock");
        }
    }
    public void ChangePrice(double newPrice){
        if (newPrice > 0){
            newPrice = price;
            System.out.println("Change price to " + newPrice + " bath");
        }
    }
    public double StockValue(){
        return price * quantity;
    }
    public void showinfo(){
        System.out.println("name :" + name);
        System.out.println(price + "bath");
        System.out.println(quantity + "items");
        System.out.println(StockValue());
    }
}
