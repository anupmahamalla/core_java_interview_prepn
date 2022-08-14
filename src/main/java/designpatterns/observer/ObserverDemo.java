package designpatterns.observer;

import java.util.ArrayList;

public class ObserverDemo {
    public static void main(String[] args) {

        Channel telusko = new Channel("Telusko", new ArrayList<>());

        Channel java_brain = new Channel("Java Brain", new ArrayList<>());

        Subscriber s1 = new Subscriber("Anup");
        Subscriber s2 = new Subscriber("Arvind");
        Subscriber s3 = new Subscriber("Raju");
        Subscriber s4 = new Subscriber("Mohit");

        telusko.subsCribe(s1);
        telusko.subsCribe(s2);
        telusko.subsCribe(s3);
        telusko.subsCribe(s4);

        java_brain.subsCribe(s3);
        java_brain.subsCribe(s4);

        telusko.upload("How to learn java");
        java_brain.upload("How to learn Microservices");

    }
}
