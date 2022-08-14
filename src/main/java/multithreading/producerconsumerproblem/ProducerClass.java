package multithreading.producerconsumerproblem;


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;

public class ProducerClass  implements Callable {

    private BlockingQueue queue;

    public ProducerClass(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public Object call() throws Exception {

        while (true){

            double doubleNumber =  Math.random()*100;

            int number = (int) doubleNumber ;

            queue.put(number);

            Thread.sleep(100);

            System.out.println( Thread.currentThread().getName() + " Producer number is " +number);

        }
    }
}
