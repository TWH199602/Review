package WorkDay4;
class Dog {

  int Dogiq;
  String name;

  public void setName(String aName) {
    name = aName;
  }

  public String getName() {
    return name;
  }

  public void setIq(int iq) {
    Dogiq = iq;
  }

  public int getIq() {
    return Dogiq;
  }
//    int rlt = Dogiq;
//    if(Dogiq < 20){
//      System.out.println("idort");
//    }else if(Dogiq>=20&&Dogiq<=80){
//      System.out.println("just fine");
//    }else if(Dogiq>80&&Dogiq<=100){
//      System.out.println("smart");
//    }
//  }
public void method1(Cat cat){
  this.print();
  System.out.println("和猫玩");
  cat.print();
}


  public void print() { //判断条件；？能否在定义DogIq时就进行条件判断；
    int rlt = Dogiq;
    if (Dogiq < 20) {
      System.out.println("idort");
    } else if (Dogiq >= 20 && Dogiq <= 80) {
      System.out.println("just fine");
    } else if (Dogiq > 80 && Dogiq <= 100) {
      System.out.println("smart");
    }
  }

}

class Cat {

  String name;
  String Color;
  String play;

  public void setName(String aName) {
    name = aName;
  }

  public String getName() {

    return name;
  }

  public void setColor(String aColor) {

    Color = aColor;
  }

  public String getColor() {

    return Color;
  }

  public void print(){//无返回值的方法无法被println方法调用；
    System.out.println(getName()+"的颜色"+getColor());

  }
  public void method(Dog dog){//创建一个和狗玩的方法，玩的对象为狗，入参为Dog类里的dog实例对象；
    this.print();
    System.out.println("和狗玩");
    dog.print();
  }
}



class Main {

    public static void main(String[] args) {
      Dog ha = new Dog();
      ha.setName("哈士奇");
      ha.setIq(-100);
      Dog ke = new Dog();
      ke.setName("柯基");
      ke.setIq(50);
      Dog jin = new Dog();
      jin.setName("金毛");
      jin.setIq(100);
      Cat bo = new Cat();//实例化Cat;在堆中开辟新的存储区域:Cat Name,Cat Color;
      bo.setName("波斯");//对Cat Name进行赋值
      bo.setColor("白色");//对Cat Color进行赋值
      Cat duan = new Cat();
      duan.setName("英短");
      duan.setColor("黑色");

      System.out.println(ha.getName() + "的智商为" + ha.Dogiq);
      ha.method1(duan);
      System.out.println(ke.getName() + "的智商为" + ke.Dogiq);
      ke.method1(bo);
      System.out.println(jin.getName() + "的智商为" + jin.Dogiq);
      jin.method1(bo);
      System.out.println(bo.getName() + "的颜色为" + bo.getColor());
      bo.method(jin);
      System.out.println(duan.getName() + "的颜色为" + duan.getColor());
      duan.method(ha);


    }
  }

