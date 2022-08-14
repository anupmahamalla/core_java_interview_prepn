package designpatterns.strategypattern;

import java.util.ArrayList;
import java.util.List;


public class StrategyPatternExample {

    //private static final Logger logger = LoggerFactory.getLogger(StrategyPattern.class);

    public static void main(String args[]) {
        List<Message> messages = getMessages();


        List < Message > filterMessageListByType = filter(messages, new FilterByType(MessageType.XML));
        List < Message > filterMessageListByKeyword = filter(messages, new FilterByKeyword("Wrong"));
        List < Message > filterMessageListBySize = filter(messages, new FilterBySize(200));

        System.out.println("Filtered by Message type "+filterMessageListByType);
        System.out.println("Filtered by Message Keyword "+filterMessageListByKeyword);
        System.out.println("Filtered by Message Size "+filterMessageListBySize);
    }





    private static List<Message> getMessages() {
        List<Message> messages = new ArrayList<>();
        messages.add(new Message(MessageType.TEXT, 100, "This is test message"));
        messages.add(new Message(MessageType.XML, 200, "How are you "));
        messages.add(new Message(MessageType.TEXT, 300, "Does Strategy pattern follows OCP design principle?"));
        messages.add(new Message(MessageType.TEXT, 400, "Wrong Message, should be filtered"));
        messages.add(new Message(MessageType.XML, 200, "I am fine "));
        return messages;
    }


    /* * This method confirms Open Closed design principle,
    * * It's open for modification, because * you can provide any filtering criterion by providing
    * * implementation of FilteringStrategy, but * no need to change any code here.
    * * New functionality will be provided by new code. */

    public static final List<Message> filter(List<Message> messageList, FilteringStrategy strategy) {
        List<Message> filteredMessagList = new ArrayList<>();

        for (Message msg : messageList) {
            if (strategy.isFilterable(msg)) {
                filteredMessagList.add(msg);
            }

        }

        //return messageList.stream().filter(x -> strategy.isFilterable(x)).collect(Collectors.toList());

        return filteredMessagList;
    }


}


