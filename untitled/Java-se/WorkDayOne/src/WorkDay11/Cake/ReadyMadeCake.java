package WorkDay11.Cake;

public class ReadyMadeCake extends Cake{
    private int quantity;

    @Override
    public double calcPrice() {
        return quantity*price;

    }
    public ReadyMadeCake (int n ,double r,int quantity){
        super(n,r);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
