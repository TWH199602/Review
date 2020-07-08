package WorkDay19.Thread;

public class ReverseHelloMultithreaded extends Thread {
    int i = 50;
     int num;

    public ReverseHelloMultithreaded(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        if(Integer.parseInt(getName()) < 50){
            System.out.println("Hello from Thread <num>!" + num);
            ReverseHelloMultithreaded reverseHelloMultithreaded = new ReverseHelloMultithreaded(num + 1);
            reverseHelloMultithreaded.start();
            try {
                reverseHelloMultithreaded.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int i = 50;
            i--;
        }
    }

    public static void doReverseHello() {

        ReverseHelloMultithreaded reverseHelloMultithreaded1 = new ReverseHelloMultithreaded(1);
        reverseHelloMultithreaded1.start();
    }
}
