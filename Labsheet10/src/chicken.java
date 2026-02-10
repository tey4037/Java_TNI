public class chicken extends Bakery {
    private int wings;
    private String spicy_level;

    public chicken(int wings ,String spicy_level ,String flavor, double unitprice){
        super(flavor,unitprice);
        this.wings = wings;
        this.spicy_level = spicy_level;
        spicy_level();
    }

    public void spicy_level(){
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

    public boolean isPackingBox(){
        return this.wings >=6;
    }

    public int getBagnumber(){
        return this.wings % 6;
    }

    @Override
    public int getPackingcost(){
        if (isPackingBox()){
            return getBagnumber() * super.getPackingcost();
        }
        return 0;
    }

    @Override
    public double calculatetotalprice(){
        return (getUnitprice() *this.wings) + getPackingcost() + (getBagnumber() * 0.5);
    }

    public String toString(){
        return super.toString() + "\nChicken wing ( Flavor : " + getFlavor() + ") with " + getBagnumber() + " Bag " + "\nTotal price Wings = " + calculatetotalprice();
    }
}
