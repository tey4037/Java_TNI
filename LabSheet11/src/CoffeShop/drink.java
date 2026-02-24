package CoffeShop;

public abstract class drink implements priceable {
    private String DrinkName;
    private double basePrice;
    private String size;

    public drink(String DrinkName, double basePrice , String size){
        this.DrinkName = DrinkName;
        this.basePrice = basePrice;
        this.size = size;
    }

    public String getDrinkName(){
        return this.DrinkName;
    }

    public double getBasePrice() {
        return basePrice;
    }

    @Override
    public double getSizeExtra() {
        if (size.equals("S") || size.equals("s")){
            return 0;
        } else if (size.equals("M") || size.equals("m")) {
            return 10;
        } else if (size.equals("L") || size.equals("l")) {
            return 15;
        }else return -1;
    }

    public abstract double calculateFinalPrice();

    public String toString(){
        return ("Your Order" + DrinkName + "(Size : " + size.toUpperCase() + ")");
    }
}
