public class Birthdaycake extends Bakery{
    private String message;
    private double pound;

    public Birthdaycake(String message,double pound, String flavor,double unitprice){
        super(flavor,unitprice);
        this.message = message;
        this.pound = pound;
    }
    public String getMessage(){
        return this.message;
    }
    public void changeMessage(String new_message){
        this.message = new_message;
    }

    @Override
    public int getPackingcost() {
        if (this.pound >= 3)
            return 10;
        return super.getPackingcost();
    }

    @Override
    public double calculatetotalprice(){
        return getUnitprice() * this.pound + super.getPackingcost();
    }

    public String toString(){
        return super.toString() + "\n" + getFlavor() +
                " birtday cake (message =" + this.message + ")"+
                "\nTotal price of birthday cake = " +
                (calculatetotalprice());
    }
}
