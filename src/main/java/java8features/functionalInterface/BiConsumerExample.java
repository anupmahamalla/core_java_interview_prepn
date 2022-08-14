package java8features.functionalInterface;

import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void main(String[] args) {

	    Integer num1 =50, num2=20;

        Integer num3 =10, num4=5;

        BiConsumer<Integer , Integer> add  = (a,b) -> {
            int k = a+ b;
            System.out.println(k);
        };

        BiConsumer<Integer , Integer> minus  = (a,b) -> {
            int k = a- b;
            System.out.println(k);
        };



        //add.accept(num1, num2);
        //minus.accept(num1,num2);

        minus.andThen(add).accept(num1,num2);
        add.andThen(minus).accept(num3,num4);

	}

}
