package WorkDay20.Synchronized.ThreadPool;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("运行");
        return "返回";
    }
}
