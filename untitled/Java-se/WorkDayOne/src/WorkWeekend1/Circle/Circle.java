package WorkWeekend1.Circle;

public class Circle {

  private static double r;



  public  Circle(double r) {
    this.r = r;
  }


  public  Circle(Circle circle){
    this.r = r;

  }
  public void setRadius(double r){
    this.r = r;
  }
  public double getRadius(){
    return r;

  }

  public static double calPerimeter() {
    return 2 * Math.PI * r;
  }

  public static double calArea() {
    return Math.PI * r * r;
  }


}
