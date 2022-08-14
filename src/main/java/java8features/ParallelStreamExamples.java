package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamExamples {
    public static void main (String [] args){

        int [] tempArray = new int[50000000];

        for(int i=0; i < tempArray.length; i++){
            double tempDouble = Math.random()*1000;
            tempArray[i] = (int)tempDouble;
        }

        List<Integer> tempList = new ArrayList<>(50000000);

        System.out.println(Calendar.getInstance().getTime());
        tempList = Arrays.stream(tempArray).parallel().filter(x -> x <900).boxed().collect(Collectors.toList());
        System.out.println("Size is " +tempList.size());
        System.out.println("Time with Parralle Stream "+Calendar.getInstance().getTime());


        System.out.println("------------------------------");
        /**
         * Without applying Parallel Stream.
         */
        System.out.println(Calendar.getInstance().getTime());
        tempList = Arrays.stream(tempArray).filter(x -> x <900).boxed().collect(Collectors.toList());
        System.out.println("Size is " +tempList.size());
        System.out.println("Time without Parralle Stream "+Calendar.getInstance().getTime());


    }
}
