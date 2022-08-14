package multithreading.producerconsumerproblem;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProdConsBuffer {

    private static int queueCapacity = 100;

    private static BlockingQueue queue = new ArrayBlockingQueue(queueCapacity);;


    public static BlockingQueue getBlockingQueue(){
        return queue;
    }




}
