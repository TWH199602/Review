package Point;

public class Points {
    private static   double x;
    private static double y;
    private static double distance;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public static double distance(){
        double rlt = distance;
        rlt = Math.sqrt(x*x+y*y);
        return rlt;
    }
}
