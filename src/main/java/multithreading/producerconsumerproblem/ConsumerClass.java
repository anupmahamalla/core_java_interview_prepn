package multithreading.producerconsumerproblem;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;

public class ConsumerClass implements Callable {

    private BlockingQueue queue;

    public ConsumerClass(BlockingQueue queue){
        this.queue = queue;
    }

    @Override
    public Object call() throws Exception {

        while (true){

            BlockingQueue queue = ProdConsBuffer.getBlockingQueue();

            int number = (int) queue.take();

            Thread.sleep(1000);

            System.out.println( Thread.currentThread().getName() + " Consumed number is " +number);

        }
    }
}
