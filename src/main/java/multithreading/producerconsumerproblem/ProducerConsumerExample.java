package multithreading.producerconsumerproblem;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProducerConsumerExample {

    public static void main (String [] args){

        BlockingQueue buffer = ProdConsBuffer.getBlockingQueue();

        ProducerClass producerClass = new ProducerClass(buffer);
        ConsumerClass consumerClass = new ConsumerClass(buffer);

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        executorService.submit(producerClass);
        executorService.submit(producerClass);

        executorService.submit(consumerClass);
        executorService.submit(consumerClass);
        executorService.submit(consumerClass);
        executorService.submit(consumerClass);
        executorService.submit(consumerClass);
        executorService.submit(consumerClass);
        executorService.submit(consumerClass);
        executorService.submit(consumerClass);

        executorService.submit(consumerClass);
        executorService.submit(consumerClass);
        executorService.submit(consumerClass);
        executorService.submit(consumerClass);
        executorService.submit(consumerClass);
        executorService.submit(consumerClass);
        executorService.submit(consumerClass);
        executorService.submit(consumerClass);




    }

}
