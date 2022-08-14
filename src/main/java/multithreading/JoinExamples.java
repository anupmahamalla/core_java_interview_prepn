package multithreading;

public class JoinExamples {

    public static void main (String []args) throws InterruptedException {

        Thread thread1 = new Thread(new Thread1());
        Thread thread2 = new Thread(new Thread2());
        Thread thread3 = new Thread(new Thread3());


        System.out.println("Start of main thread");

        thread1.start();
        thread1.join(1000);


        thread2.start();
        thread2.join(2000);


        thread3.start();
        thread3.join(3000);

        System.out.println("End of main thread");

    }


}

class Thread1 implements Runnable{

    public void run (){
        for(int i =0; i<5;i++) {
            System.out.println("THis is Thread 1");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class Thread2 implements Runnable{

    public void run (){
        for(int i =0; i<5;i++) {
            System.out.println("THis is Thread 2");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}


class Thread3 implements Runnable{

    public void run (){
        for(int i =0; i<5;i++) {
            System.out.println("THis is Thread 3");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


