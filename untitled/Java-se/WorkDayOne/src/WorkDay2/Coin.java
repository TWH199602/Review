package WorkDay2;

public class Coin {
    public static void countMoney(){
      int count = 0;
      for (int i = 1; i <= 98; i++) {
        for (int j = 1; j <= 98; j++) {
          int a = i + 2 * j + 5 * (100 - i - j);
          if (a == 150 && (100 - i - j) > 0) {
            count++;
            System.out.print("第" + count + "种方案");
            System.out.println("1分" + i + "枚" + "2分" + j + "枚" + "5分" + (100 - i - j) + "枚");
          }
        }
      }
      System.out.println("共有" + count + "种方案");
    }


  }
