package WorkDay6;
import java.util.Scanner;
import java.util.Random;
public class RandomMode {

//    public static void main(String[] args) {
//      int size = 1000000;
//      int[] a = new int[size];
//      int[] b = new int[size];
//      System.arraycopy(a, 0, b, 0, size);
//
//      for (int i = 0; i < size; i++) {
//        b[i] = a[i];
//      }
//
//      Random random1 = new Random(10);
//      Random random2 = new Random(10);
//      System.out.println(random1.nextInt()); // -1157793070
//      System.out.println(random2.nextInt()); // -1157793070
//      System.out.println(random1.nextInt()); // 1913984760
//      System.out.println(random2.nextInt()); // 1913984760
//      System.out.println(random1.nextInt(10)); // 3
//      System.out.println(random2.nextInt(10)); // 3
//
//    }
public static void main(String[] args) {
  Scanner ip = new Scanner(System.in);
  System.out.println("输入随机数取值范围的左区间：");
  int start = ip.nextInt();
  System.out.println("输入随机数取值范围的右区间：");
  int end = ip.nextInt();

  for (int i = 0; i < 10 ; i++) {
    int rlt = getRandom(1,10);
    System.out.println(rlt);

  }
}
public static int getRandom(int start,int end){
  int random = (int)(Math.random()*(end - start +1)+start);//Math.random()为（0，1）之间的随机数
  return random;
}
  }

