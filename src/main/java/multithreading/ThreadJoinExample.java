package multithreading;
public class ThreadJoinExample implements Runnable {

    public static void main(String[] args) {
        System.out.println("I'm " + Thread.currentThread().getName() + " Starting");
        Thread t1 = new Thread(new ThreadJoinExample());
        t1.start();
        try {
            t1.join();
        }
        //catch (InterruptedException ex) {
        // do nothing
        //}
        catch (Exception e ){
            e.printStackTrace();
        }
        System.out.println("I'm " + Thread.currentThread().getName()+ " Ending");
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("This is message #" + i);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                System.out.println("I'm about to stop");
                return;
            }
        }
    }


}