package club.banyuan.demo;

import java.util.Objects;

public class Outer {

  /**
   * 作用：
   *   1.内部类可以很好的实现隐藏
     *  一般的非内部类，是不允许有 private 与protected权限的，但内部类可以
     * 2．内部类拥有外围类的所有元素的访问权限
     * 3.可是实现多重继承
     * 4.可以避免修改接口而实现同一个类中两种同名方法的调用。
   */
    String  name="outer";
    private  static   String  address="waibu...Address";

    private  void  method(){
      System.out.println("Outer....method");
    }

    private    class  Inner{
        String  name="inner";

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public  String   method(){
      System.out.println("inner class method..."+address+Outer.this.name);
      Outer.this.method();
      return "hahah";
    }

    @Override
    public String toString() {
      return "Inner{" +
          "name='" + name + '\'' +
          '}';
    }
  }


  public  String  getInner(){
   return    new Inner().method();
  }
}

class  TestInner{

  public static void main(String[] args) {
    // 外部类名.内部类名   变量名=外部类对象.内部类对象
//      Outer.Inner  oi=new Outer().new Inner();
//      oi.method();

      String    s=new Outer().getInner();

   String  str= new   X() {
      @Override
      public String method(String name) {
        System.out.println("i am  abstract class");
        return "zhangasnfeng"+name;
      }
    }.method("wangbadan"); //得到的是字符串

    System.out.println(str);


    Tool_Outer_Inner.get(new X() {
      @Override
      public String method(String name) {
        return name;
      }
    }, "zhangsan");
  }
}
abstract class  X{

  public abstract  String  method(String  name);

}

class Tool_Outer_Inner{

  private Tool_Outer_Inner(){

  }

  //此方法支队method 调用一次
  public    static  void get(X  x,String name){ //
    System.out.println("result="+x.method(name));
  }

}