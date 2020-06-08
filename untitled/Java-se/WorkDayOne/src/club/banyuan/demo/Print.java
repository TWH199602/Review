package club.banyuan.demo;

import java.lang.String;

public class Print {

  public static void main(String[] args) {
    String[][] a = new String[3][];
    a[0] = new String[]{"你", "我", "他"};
    a[1] = new String[]{"金", "木", "水", "火", "土"};
    a[2] = new String[]{"天", "地"};
    System.out.println(a);
    for (int i = 0; i < a.length; i++) { //遍历每行数组的长度
      for (String j : a[i]) //遍历每行数组的元素
      {
        System.out.print(j + " "); //打印每行数组的元素；print与println的区别：前者输出后不换行，后者输出后换行；
      }
      System.out.println();//打印完一行后换行；
    }

  }
}
