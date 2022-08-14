package multithreading;


public class HelloWorld {

    public static void main(String[] args) {
        try {
                Thread thread = new Thread(new HelloWorldRunnable());
                System.out.println("State is : "+ thread.getName() +" " + thread.getState());
                thread.start();
                System.out.println("State is : "+ thread.getName() +" " + thread.getState());
                //Thread.sleep(800);
                System.out.println("State is : "+ thread.getName()+" " + thread.getState());

            Thread thread2 = new Thread(new HelloWorldRunnable2());
            System.out.println("State is : "+ thread2.getName() +" " + thread2.getState());
            thread2.start();
            System.out.println("State is : "+ thread2.getName() +" " + thread2.getState());
            //Thread.sleep(800);
            System.out.println("State is : "+ thread2.getName()+" " + thread2.getState());
            thread2.join();

            Thread.sleep(100);
            System.out.println("State is : "+ thread.getName()+" " + thread.getState());
            System.out.println("State is : "+ thread2.getName()+" " + thread2.getState());

            Thread.sleep(1000);



            System.out.println("State is : "+ thread.getName()+" " + thread.getState());
            System.out.println("State is : "+ thread2.getName()+" " + thread2.getState());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

class CommonResource {
    public static synchronized void commonResource () throws InterruptedException {
        for(int i= 0;i <=10;i++){
            Thread.sleep(100);
        }
    }
}




class HelloWorldRunnable2 implements Runnable {
    public void run(){

        try {
            CommonResource.commonResource();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class HelloWorldRunnable implements Runnable {
    public void run(){
        try {
            CommonResource.commonResource();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
