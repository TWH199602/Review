package WorkDay19;

import java.util.Scanner;

public class MyThread extends Thread {
    public MyThread(String name){
        super(name);
    }

    public MyThread() {
    }

    public MyThread(Runnable target) {
        super(target);
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        try {
        for (char c : input.toCharArray()) {
            System.out.print(c);
                MyThread.sleep(1000);
        }
            }catch (InterruptedException e) {
                e.printStackTrace();
            }


        }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        MyThread thread1 = new MyThread();
        thread1.start();

    }
}
