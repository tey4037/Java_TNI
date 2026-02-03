public class chicken extends Bakery {
    private int wings;
    private String spicy_level;
    private int price;

    public chicken(int wings,int price ,String spicy_level){
        spicy_level();
        this.wings = wings;
        this.price = price;
        this.spicy_level = spicy_level;
    }

    public String spicy_level(){
        if (spicy_level == "1"){
            return "level1";
        } else if (spicy_level == "2") {
            return "level2";
        } else if (spicy_level == "3") {
            return "level3";
        }else
            return "level1";
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
        if (getWings() > 3){
            return "You get free packing cost " + " Price : " +  totalprice() + " Spicy Level : " + getSpicy_level() + " Wings : " + getWings();
        }
        return "Price : " +  totalprice() + " Spicy Level : " + getSpicy_level() + " Wings : " + getWings();
    }
}
