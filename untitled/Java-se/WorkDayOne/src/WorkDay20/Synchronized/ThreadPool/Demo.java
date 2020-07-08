//package WorkDay20.Synchronized.ThreadPool;
//
//import java.util.concurrent.ExecutionException;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Future;
//
//import static java.util.concurrent.Executors.newCachedThreadPool;
//
//public class Demo {
//    public static void main(String[] args) {
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("启动");
//            }
//        });
//        ExecutorService executorService = newCachedThreadPool();
//        Future<String> submit = executorService.submit(new MyCallable());
//
//        try {
//            String s = submit.get();
//            System.out.println(s);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }
//
//    }
//}
