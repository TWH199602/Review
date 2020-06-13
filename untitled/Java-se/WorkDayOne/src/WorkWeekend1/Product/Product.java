package WorkWeekend1.Product;

public class Product {
private String name;
private double price;
private static int scanCode = 1000;
private int num;

public Product(String name,double price){
  this.name = name;
  this.price = price;
  scanCode++;
}
public String getName(){
  return name;
}
public double getPrice(){
  return price;
}
public int getScanCode(){
  return scanCode;
}
public int getNum(){
  return num;
}
public void changePrice(double price){
  this.price = price;

}
public void setNum(int num){
  this.num = num;
}
public String getInfo(){
  return ("--- 产品信息 ---"+"\n名称:"+name+"\n编码:"+scanCode+"\n价格:"+price);
}
public boolean Buy(int num){
  if (this.num >= num) {
    this.num -= num;
    return true;
  }
  return false;

}
}
