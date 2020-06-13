package WorkWeekend1.Circle;

public class CircleApp {
  public static void main(String[] args) {
    double rd = 12.3;
    System.out.println("半径 = " + rd);


    Circle circle1 = new Circle(rd);
    double cir = circle1.calPerimeter();
    double area = circle1.calArea();

    System.out.println("圆1：");
    System.out.println("周长：" + circle1.calPerimeter());
    System.out.println("面积：" + circle1.calArea());

    Circle circle2 = new Circle(8);
    circle2 = null;
    double cir2 = circle2.calPerimeter();
    double area2 = circle2.calArea();

    System.out.println("圆2：");
    System.out.println("周长：" + circle2.calPerimeter());
    System.out.println("面积：" + circle2.calArea());
    System.out.println(circle2);

    Circle circle3 = circle2;
    double cir3 = circle3.calPerimeter();
    double area3 = circle3.calArea();

    System.out.println("圆3：");
    System.out.println("周长：" + circle3.calPerimeter());
    System.out.println("面积：" + circle3.calArea());
  }
}
