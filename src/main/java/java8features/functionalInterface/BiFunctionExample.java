package java8features.functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionExample {

    public static void main (String []args){
       // listCombinerExample();

        BiFunctionExample biFunctionExample = new BiFunctionExample();
        biFunctionExample.addingTwoNumbers();
    }

    class ABC{
        private int id=1;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    class XYZ{
        private int id=1;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    class MNO{
        private int id=1;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


    public void addingTwoNumbers(){

        BiFunction <Integer, Integer, Integer > addandreturn = (a,b ) -> a+b ;
        System.out.println(addandreturn.apply(1,4));

        BiFunction <ABC, XYZ, MNO > retunObjectWithUsingBiFunction = (abc,xyz ) ->  {
            int abcId =abc.id;
            int xyzId =xyz.id;

            MNO mnoObj = new MNO();

            mnoObj.setId(abcId+xyzId);
            return mnoObj;

        };

        ABC abc = new ABC(); abc.setId(10);

        XYZ xyz = new XYZ(); xyz.setId(15);

        MNO mnoObj = retunObjectWithUsingBiFunction.apply(abc,xyz);

        System.out.println(mnoObj.getId());

    }





    private static void listCombinerExample() {
        List<String> list1 = Arrays.asList("a", "b", "c");
        List<Integer> list2 = Arrays.asList(1, 2, 3);

        List<String> result = new ArrayList<>();
        for (int i=0; i < list1.size(); i++) {
            result.add(list1.get(i) + list2.get(i));
        }

        result = listCombiner( list1, list2, (l1, l2)->l1 + l2);

        System.out.println("The result is " +result);

    }

    private static <T, U, R> List<R> listCombiner(
            List<T> list1, List<U> list2, BiFunction <T, U, R> combiner) {
        List<R> result = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            result.add(combiner.apply(list1.get(i), list2.get(i)));
        }
        return result;
    }



}
