package WorkDay11.Cake;

public class OrderCake extends Cake{
    private int whightInKG;

    public OrderCake(int n ,double r,int whightInKG){
        super(n,r);
        this.whightInKG = whightInKG;
    }

    @Override
    public double calcPrice() {
        return whightInKG* price;
    }

    public int getWhightInKG() {
        return whightInKG;
    }

    public void setWhightInKG(int whightInKG) {
        this.whightInKG = whightInKG;
    }
}
