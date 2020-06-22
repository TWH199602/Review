package WorkDay11.Shape;

public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        areaCalculator.show(new Circle(20),new Rectangle(10,5));
        areaCalculator.show(new Rectangle(20, 15));
    }
}
