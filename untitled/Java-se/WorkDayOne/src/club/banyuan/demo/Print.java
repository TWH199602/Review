package club.banyuan.demo;

import java.lang.String;

public class Print {

  public static void main(String[] args) {
    String[][] a = new String[3][];
    a[0] = new String[]{"你", "我", "他"};
    a[1] = new String[]{"金", "木", "水", "火", "土"};
    a[2] = new String[]{"天", "地"};
    System.out.println(a);
    for (int i = 0; i < a.length; i++) {
      for (String j : a[i])
        System.out.print(j + " ");
      System.out.println();
    }

  }
}
