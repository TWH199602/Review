package WorkDay2;

public class Test {

  public static void main(String[] args) {
//    int test = 2;
//    switch (test) {
//      case 1:
//        System.out.println(1);
//        break;
//      case 2:
//        System.out.println(2);
//      case 3:
//        System.out.println(3);
//        break;
//      default://在所有case都不满足时执行default.
//        System.out.println("default");

//        boolean test = 1>2;
//        if (test) { //判断条件必须是boolean类型；
//          System.out.println("1");
//        }
//        else{
//          System.out.println("2");
//        }
//    }
//  }

//    int b = 5;
//    if (b < 0) {
//      System.out.println("1");
//    } else if (b > 4) { //或者写为else {System.out.println("2");}  :else后面要么不加判断条件，加了判断条件需要写为else if
//      System.out.println("2");
//    }
//  }
//}
    int test = 5;//变量的初始化必须在代码块外部进行，否则在for循环中会一直循环定义
    for (; ; ) { //for（int test = 5;test++ <10 ;test++ )是被允许的；
      //int test = 5;
      System.out.println(test);
      if (test++ > 10) {
        break;
      }
    }
  }
}

