package multithreading;

import java.util.concurrent.*;

public class Completable_Future_Example {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        // executor is not provided, CompletableFuture.supplyAsync will use ForkJoinPool by default
        ExecutorService executor = Executors.newCachedThreadPool();

        CompletableFuture<String> sliceTomatoes = CompletableFuture.supplyAsync(() -> {
            System.out.println("   Restaurant> Slicing tomatoes1");
            String tomatoes = "Tomatoes";
            tomatoes = null;
            if (tomatoes == null) {
                throw new RuntimeException("No tomatoes");
            }
            return "Tomatoes ";
        }, executor).handle((result, e) -> {
            if (result == null) {
                System.out.println("Problems with tomatoes");
                return "";
            }
            return result;
        });

        CompletableFuture<String> sliceTomatoes2 = CompletableFuture.supplyAsync(() -> {
            System.out.println("   Restaurant> Slicing tomatoes2");
            String tomatoes = "Tomatoes";
            tomatoes = null;
            if (tomatoes == null) {
                throw new RuntimeException("No tomatoes");
            }
            return "Tomatoes ";
        }, executor).handle((result, e) -> {
            if (result == null) {
                System.out.println("Problems with tomatoes2");
                return "";
            }
            return result;
        });

        CompletableFuture<String> sliceTomatoes3 = CompletableFuture.supplyAsync(() -> {
            System.out.println("   Restaurant> Slicing tomatoes3");
            String tomatoes = "Tomatoes";
            tomatoes = null;
            if (tomatoes == null) {
                throw new RuntimeException("No tomatoes");
            }
            return "Tomatoes ";
        }, executor).handle((result, e) -> {
            if (result == null) {
                System.out.println("Problems with tomatoes3");
                return "";
            }
            return result;
        });

        CompletableFuture<String> sliceTomatoes4 = CompletableFuture.supplyAsync(() -> {
            System.out.println("   Restaurant> Slicing tomatoes4");
            String tomatoes = "Tomatoes";
            tomatoes = null;
            if (tomatoes == null) {
                throw new RuntimeException("No tomatoes");
            }
            return "Tomatoes ";
        }, executor).handle((result, e) -> {
            if (result == null) {
                System.out.println("Problems with tomatoes4");
                return "";
            }
            return result;
        });

        CompletableFuture<String> chopOnions = CompletableFuture.supplyAsync(() -> {
            System.out.println("   Restaurant> Chopping onions");

            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return "Onions ";
        }, executor);

        CompletableFuture<String> prepIngredients = chopOnions.thenCombine(sliceTomatoes2.
                        thenCombine(sliceTomatoes3.
                                thenCombine(sliceTomatoes4.thenCombine(sliceTomatoes,String::concat),String::concat),String::concat),String::concat);

        CompletableFuture<Object> prepPizza = prepIngredients.thenApply(toppings -> {
            System.out.println("   Restaurant> Spreading with tomato sauce and sprinkle with toppings: " + toppings);
            return "Raw pizza with " + toppings;
        });

        CompletableFuture<String> bakePizza = prepPizza.thenApply(rawPizza -> {
            System.out.println("   Restaurant> Baking pizza: " + rawPizza);
            try {
                TimeUnit.MILLISECONDS.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Pizza";
        });

        bakePizza.thenAccept(pizza -> System.out.println("Eating pizza: " + pizza));
        // or, the old way  // System.out.println(bakePizza.get());

        executor.shutdown();
    }

}
