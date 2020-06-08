package club.banyuan.demo;

public class ForEach {

  public static void main(String[] args) {
    //字符串数组
//      String []str= {"twh","fartman"};
//
//      for(String s:str) {
//        System.out.println(s);
//      }
    int[] arr = new int[]{11, 22, 33};//arr数组为ForEach类创建的一个对象，new为这个对象数组创建实例，并为其分配变量（数组元素）

    for (int n : arr) { //变量n代表被遍历到的数组元素，自定义

      System.out.println(n);
      System.out.println("-------------------");

    }
  }
}




