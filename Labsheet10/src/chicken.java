public class chicken extends Bakery {
    private int wings;
    private String spicy_level;
    private int price;

    public chicken(int wings,int price ,String spicy_level){
        this.wings = wings;
        this.price = price;
        this.spicy_level = spicy_level;
        spicy_level();
    }

    private void spicy_level(){
        if (spicy_level.equals("1")){
            this.spicy_level = "Mild Spicy";
        } else if (spicy_level.equals("2")) {
            this.spicy_level = "Normal Spicy";
        } else if (spicy_level.equals("3")) {
            this.spicy_level = "Extra Spicy";
        } else {
            this.spicy_level = "Mild Spicy";
        }
    }

    public String getSpicy_level(){
        return this.spicy_level;
    }

    public int getWings(){
        return this.wings;
    }

    @Override
    public int getPackingcost(){
        if (getWings() > 3)
            return 0;
        return super.getPackingcost();
    }

    public int totalprice(){
        return wings * price;
    }
    public String toString(){
        if (getWings() >= 3){
            return "You get free packing cost " + "\nPrice : " +  totalprice() + "bath "+ "\nSpicy Level : " + getSpicy_level() + "\nWings : " + getWings();
        }
        return "Price : " +  totalprice() + "Bath" + "\nSpicy Level : " + getSpicy_level() + "\nWings : " + getWings();
    }
}
