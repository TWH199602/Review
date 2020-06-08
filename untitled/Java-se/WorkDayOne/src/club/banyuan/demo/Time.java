package club.banyuan.demo;

public class Time {

  public static void main(String[] args) {
    int[] sevenDays = new int[]{7 * 24 * 60 * 60 * 1000};
    for (int a : sevenDays) {
      System.out.println(a);
    }

    long[] oneMonth = new long[]{30*24*60*60*1000L};
    for(long i : oneMonth) {
      System.out.println(i);
    }
  }
}