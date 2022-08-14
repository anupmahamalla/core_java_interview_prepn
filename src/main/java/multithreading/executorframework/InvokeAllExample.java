package multithreading.executorframework;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class InvokeAllExample {
    public static void main (String [] args){

        int totalNum =1000000000;

        //for (int i = 0; i < 10; i++) {
            try {

                ExecutorService executorService = Executors.newFixedThreadPool(2);
                Callable callable = new CallableExample();
                Set<Callable<String>> callables = new HashSet<Callable<String>>();

                callables.add(new Callable<String>() {
                    public String call() throws Exception {
                        //Thread.sleep(5000);
                        return "Task 1";
                    }
                });
                callables.add(new Callable<String>() {
                    public String call() throws Exception {
                        //Thread.sleep(5000);
                        for (int i = 0; i < 100; i++) {
                            for (int j = 0; j < 100; j++) {
                            }
                        }
                        return "Task 2";
                    }
                });
                callables.add(new Callable<String>() {
                    public String call() throws Exception {
                        for (int i = 0; i < totalNum; i++) {
                            for (int j = 0; j < totalNum; j++) {

                            }
                        }

                        return "Task 3";
                    }
                });
                callables.add(callable);



            List<Future<String>> futures = executorService.invokeAll(callables);


            for (Future<String> future : futures) {
                System.out.println("future.get = " + future.get());
                if(future.get().equals("Task 2")){
                    System.out.println("Task is  = " + future.get().toString());
                    future.cancel(true);
                    System.out.println("isDone = " + future.isDone());
                    System.out.println("isCancelled = " + future.isCancelled());
                }
            }

                //String result = executorService.invokeAny(callables);
                //System.out.println("Result= " + result);


                executorService.shutdown();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    //}
}



class CallableExample implements Callable{

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100000000; i++) {
            for (int j = 0; j < 100000000; j++) {

            }

        }
        return "task 4";
    }
}

