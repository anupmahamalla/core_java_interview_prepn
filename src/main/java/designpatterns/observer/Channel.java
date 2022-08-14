package designpatterns.observer;

import java.util.List;

public class Channel {
    private String channelName;
    String title;
    List<Subscriber> subscriberList;

    public Channel(String channelName, List<Subscriber> subscriberList) {
        this.channelName = channelName;
        this.subscriberList = subscriberList;
    }

    public void subsCribe(Subscriber subscriber){
        subscriberList.add(subscriber);
    }

    public void unSubsCribe(Subscriber subscriber){
        subscriberList.remove(subscriber);
    }

    public void notifySubscriber(String msg){
        for(Subscriber subscriber : subscriberList){
            subscriber.update(msg);
        }
    }

    public void upload(String title){
        this.title= title;
        notifySubscriber(title);
    }


    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public List<Subscriber> getSubscriberList() {
        return subscriberList;
    }

    public void setSubscriberList(List<Subscriber> subscriberList) {
        this.subscriberList = subscriberList;
    }
}
