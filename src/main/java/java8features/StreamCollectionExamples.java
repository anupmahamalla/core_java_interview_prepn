package java8features;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectionExamples {
    public static void main (String [] args){

        int [] tempArray = {100,25,1,2,67,3,4,5,10};

        for(int i=0; i < tempArray.length;i++) {
            //System.out.println(tempArray[i]);
        }

        Arrays.stream(tempArray).filter(x -> x >10) .forEach(x ->System.out.println(x));

        System.out.println("--------------");

        Arrays.stream(tempArray).map(x -> x +10) .forEach(x ->System.out.println(x));

        System.out.println("--------------");

        String [] strArray = {"abc","xyz","mno","opq","abc","xyz","mno","opq" , "123"};
        Stream.of(strArray).forEach(x ->System.out.println(x));
        long count = Stream.of(strArray).collect(Collectors.toList()).stream().distinct().count();
        System.out.println("Count is "+count);



    }
}
