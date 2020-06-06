package club.banyuan.demo;

public class Modifier {
  private int a = 10;
  int b = 20;
  protected int c = 30;
  public int d = 40;

  boolean flag;



  public void setFlag(boolean flag){
    this.flag = flag;
  }

  public boolean isFlag(){

    return flag;
  }


  private void a(){

  }

  void b(){

  }

  protected void c(){

  }

  public void show(){
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);

  }


}

