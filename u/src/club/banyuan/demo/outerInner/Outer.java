package club.banyuan.demo.outerInner;

public class Outer{

  public class   Inner  extends  A{
      @Override
      public void method1() {

      }
    }

    public class   Inner2  extends  B{

      @Override
      public void method1() {

      }
    }



}





interface  A1{
  void  method1();
}



abstract  class  A{

  public abstract void  method1();
}
abstract  class  B{

  public abstract void  method1();
}