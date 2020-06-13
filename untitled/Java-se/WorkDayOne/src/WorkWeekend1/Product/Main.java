package WorkWeekend1.Product;

public class Main {

  public static void main(String[] args) {
    Product goods1 = new Product("手机",2001);
    System.out.println("getInfo");
    System.out.println(goods1.getInfo());
    System.out.println();
    System.out.println("--- 产品信息 ---");
    System.out.println("名称:"+goods1.getName());
    System.out.println("编码:"+goods1.getScanCode());
    System.out.println("价格:"+goods1.getPrice()+"元");
    System.out.println();
    System.out.println("===修改价格===");
    goods1.changePrice(3001);
    System.out.println("修改后的价格:"+goods1.getPrice());//修改价格时修改后的price赋值给新的price,所以调用goods的方法时应该调用getprice；
    System.out.println();

    System.out.println("===设置库存===");
    goods1.setNum(800);
    System.out.println("商品库存为:"+goods1.getNum());

    System.out.println("===购买商品===");
    System.out.println("购买数量为799，能否购买:"+goods1.Buy(799));

    System.out.println("购买数量为1，能否购买:"+goods1.Buy(1));

    System.out.println("购买数量为1，能否购买:"+goods1.Buy(1));//商品库存为一个固定的属性，当购买的数量大于商品库存时无法购买，若要继续购买则需对num重新赋值；
    Product goods2 = new Product("我tm直呼内行",99999);

    System.out.println(goods2.getInfo());
  }

}
