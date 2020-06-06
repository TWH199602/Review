package club.banyuan.demo;

public abstract class Person {



  public abstract void  getAll(String  name); //父类不要具体的实现  靠子类

}


class  Son  extends  Person{

  public  void  getAll(String  name){
    System.out.println("getAll name  message...Computer...");
  }

}
class  Son1  extends  Person{

  public  void  getAll(String  name){
    System.out.println("getAll name  message...DouYin...");
  }
}


class  Test{

  public static void main(String[] args) {
  Son  son=new  Son();
    Tool.getName(son);
  }
}






class  Tool{


//  public  static   void  getName(Son  son){
//    son.getAll("zhangsan");
//  }
//  public  static   void  getName(Son1  son1){
//    son1.getAll("zhangsan");
//  }

    public  static   void  getName(Person  person){  //看具体对象
      person.getAll("zhangsan");
    }




  }