package designpatterns.observer;

public class Subscriber {
    private String subsName="";

    public Subscriber(String subsName) {
        this.subsName = subsName;
    }


    public void update(String msg){
        System.out.println( "Hey " +subsName +" Video Uploaded ::-> " + msg);
    }
}
