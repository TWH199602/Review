package WorkDay6;

public class Count {
  public static void main(String[] args) {
    int[] arr1 = new int[0xFFFFFFF];
    int[] arr2 = new int[0xFFFFFFF];
    long start = System.currentTimeMillis();
    for (int i = 0; i < arr1.length; i++) {
      arr1[i] = arr2[i];
      long end = System.currentTimeMillis();
      System.out.println(arr2[i]);
      System.out.println(end - start);

      int[] arr3 = new int [0xFFFFFF];
      int[] arr4 = new int [0XFFFFFF];
    System.arraycopy(arr3,0,arr4,0,0xFFFFFFF);
    long start1 = System.currentTimeMillis();
    long end1 = System.currentTimeMillis();
      System.out.println(arr2);
      System.out.println(end1 - start1);

    }
  }
}
