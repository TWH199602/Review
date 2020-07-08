package WorkDay19.test;

/**
 * 线程计算数组元素的正弦值的和。
 */
class SumThread extends Thread {

  private int lo, hi;
  private int[] arr;
  private double ans = 0;

  public SumThread(int[] arr, int lo, int hi) {
    this.lo = lo;
    this.hi = hi;
    this.arr = arr;
  }

  @Override
  public void run() {
    for (int i = lo; i < hi; i++) {
      ans += Math.sin(arr[i]);
    }
  }

  public double getAns() {
    return ans;
  }
}

