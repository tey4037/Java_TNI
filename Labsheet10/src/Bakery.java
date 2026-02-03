public class Bakery {
    private String flavor;
    private double unitprice;
    private int packingcost;

    public Bakery (String flavor , double unitprice){
        this.flavor = flavor;
        this.unitprice = unitprice;
    }

    public Bakery(){
        this("",0.0);
    }

    public String getFlavor(){
        return this.flavor;
    }

    public double getUnitprice(){
        return this.unitprice;
    }
    public int getPackingcost(){
        return this.packingcost = packingcost;
    }
    public double calculatetotalprice() {
        return this.unitprice + this.packingcost;
    }
    public String toString(){
        return "Thank you for your order";
    }

}
