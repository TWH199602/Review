package WorkDay20.Synchronized.PhoneSimulatorRefine;

import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CellularPhone extends Thread {
  //线程不安全集合；会导致数据丢失；
  TreeSet<String> set = new TreeSet<>();
  //CopyOnWriteArrayList ; CopyOnWriteArraySet ; ConcurrentHashMap,线程安全集合；
  private volatile boolean callInProgress = false;
  private volatile boolean keepGoing = true;
  private Lock lock = new ReentrantLock();
  public CellularPhone(String name) {
    super(name);
  }

  /**
   * 假设控制台是手机的窗口。
   *
   * @param message 要显示的消息
   */
  void display(String message) {
    System.out.println(message);
  }

  /**
   * 接听电话。在终端显示消息。
   *
   * @param name               调用方的名称
   * @param callDisplayMessage 呼叫正在进行时显示的消息
   * @returns 如果调用被接受，则为true
   */
  public boolean startCall(String name, String callDisplayMessage) {
    if(callInProgress){
      return false;
    }

    boolean b = false;
    try {
      //tryLock,尝试获取锁，程序不会因为拿不到锁而卡住；
      b = lock.tryLock(3, TimeUnit.SECONDS);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    if(!b){
      return false;
    }
    callInProgress = true;
    display("<" + name + ">: Call (" + callDisplayMessage + ") begins");
    return true;
  }

  /**
   * 挂断电话。在此方法完成后，电话能够接听其他电话。
   *
   * @param name               调用方的名称
   * @param callDisplayMessage 要显示的消息
   */
  public void endCall(String name, String callDisplayMessage) {
    display("   <" + name + ">: Call (" + callDisplayMessage + ") ends");
    callInProgress = false;
    lock.unlock();
  }

  /**
   * 显示手机正在等待做某事
   */
  private void displayWaiting() {
    display("<" + this.getName() + ">: Waiting...");
  }

  /**
   * 停止电话接听程序
   */
  public void stopPhone() {
    keepGoing = false;
  }

  /**
   * 运行模拟器
   */
  @Override
  public void run() {
    // 循环直到stopPhone被调用
    while (keepGoing) {
      // 如果没有电话
      if (!callInProgress) {
        displayWaiting();
        synchronized (this) {
          for (String s : set) {
            System.out.println(set);
          }
          set.clear();
        }
      }
        // 假装手机在做别的事情
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }


//利用集合储存信息
  public void addMessage(String s) {

    set.add(s);

  }

}
