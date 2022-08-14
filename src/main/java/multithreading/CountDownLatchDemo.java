package multithreading;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class CountDownLatchDemo {

    public static void main (String [] args) throws InterruptedException {

        CountDownLatch countDownLatch = new CountDownLatch(3);

        Callable callable = new Worker(countDownLatch,"worker 1 \n" );
        Callable callable2 = new Worker(countDownLatch,"worker 2 \n");
        Callable callable3 = new Worker(countDownLatch,"worker 3 \n");

        Collection callables = new ArrayList<>();
        callables.add(callable);
        callables.add(callable2);
        callables.add(callable3);

        ExecutorService executorService = Executors.newFixedThreadPool(1);

        List<Future<String>> futures = executorService.invokeAll(callables);
        countDownLatch.await();

        System.out.println(Thread.currentThread().getName() +  " has finished");

        executorService.awaitTermination(10000, TimeUnit.MILLISECONDS);
    }
}

class Worker implements Callable{
    CountDownLatch countDownLatch;
    String workerName;

    public Worker(CountDownLatch countDownLatch, String workerName) {
        this.countDownLatch = countDownLatch;
        this.workerName = workerName;

    }

    @Override
    public String call() throws Exception {
        this.countDownLatch.countDown();
        String msg = "this is %s";
        System.out.printf(msg, workerName);
        return this.workerName;
    }

    public CountDownLatch getCountDownLatch() {
        return countDownLatch;
    }

    public void setCountDownLatch(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }


}
