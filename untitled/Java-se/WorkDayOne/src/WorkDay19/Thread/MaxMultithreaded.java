package WorkDay19.Thread;

public class MaxMultithreaded {

  public static double max(int[] arr, int numThreads) {
    return 0;
  }

  /**
   * 计算数组元素的sin值之后，返回最大值。
   *
   * @return sin(数组元素)的最大值
   * @throws InterruptedException 不应该出现此异常
   */
  static class MaxThread extends Thread {

    private int lo, hi;
    private int[] arr;
    //NEGATIVE_INFINITY负无穷；
    private static double max = Double.NEGATIVE_INFINITY;

    public MaxThread(int[] arr, int lo, int hi) {
      this.lo = lo;
      this.hi = hi;
      this.arr = arr;
    }

    @Override
    public void run() {
      for (int i = lo; i < hi; i++) {
        double tempMax = Math.sin(arr[lo]);
        if (max < tempMax) {
          max = tempMax;
        }
      }
    }

    public double getMax() {
      return max;
    }

    public static double max(int[] arr, int numThreads) throws InterruptedException {
      int len = arr.length;
      double ans = 0;
      MaxThread[] maxThreads = new MaxThread[numThreads];
      for (int i = 0; i < numThreads; i++) {
        maxThreads[i] = new MaxThread(arr, (i * len) / numThreads, ((i + 1) * len) / numThreads);
        maxThreads[i].start();

      }

      for (int i = 0; i < numThreads; i++) {
        maxThreads[i].join();
        double tempMax = Math.sin(arr[i]);
        if (max < tempMax) {
          max = tempMax;
        }

      }
      return max;
    }
  }

}

