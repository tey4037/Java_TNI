public class cupcake extends Bakery{
    private int piece;

    public cupcake(int piece,String flavor,double unitprice){
        super(flavor,unitprice);
        this.piece = piece;
    }
    public boolean isPackingBox(){
        return this.piece >= 6;
    }
    public int getBoxnumber(){
        if (isPackingBox()){
            return this.piece / 6;
        }
        return 0;
    }
    public int getBagnumber(){
        return this.piece %6;
    }

    @Override
    public int getPackingcost(){
        if (isPackingBox())
            return getBoxnumber() * super.getPackingcost();
        return 0;
    }


    @Override
    public double calculatetotalprice(){
        return (getUnitprice() *this.piece) + getPackingcost() + (getBagnumber() * 0.5);
    }
    public String toString(){
        return super.toString() + "\nCup Cake (" + getFlavor() + ") with" + (isPackingBox() ? getBagnumber() + " BOX " : "")  + getBagnumber() + "bag" + "\ntotal price of Cupcake = " + (getUnitprice() * this.piece);
    }
}
