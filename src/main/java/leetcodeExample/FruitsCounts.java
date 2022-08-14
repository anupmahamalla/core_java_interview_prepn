package leetcodeExample;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FruitsCounts {

    public static void main(String[] args) {


        String sen = "India is my Country";
        String [] strA = sen.split(" ");

        StringBuffer newStr= new StringBuffer();

        for(int i=0 ;i <strA.length;i++){
            char [] charArr = strA[i].toCharArray();
            StringBuffer temp= new StringBuffer();
            for(int j=charArr.length-1 ;j >=0 ;j--) {
                temp.append(charArr[j]);
            }
            newStr.append(" " +temp);
        }

        System.out.println(newStr);




        String [] strArr = {"Mango", "Apple", "Mango","Coconut"};


        List tempList = Arrays.asList(strArr);
        //Map<String,Integer> hashMap = (Map<String, Integer>) tempList.stream().collect(Collectors.toMap(w -> w, w -> 1,Integer::sum));
        Map<String,Integer> hashMap = (Map<String, Integer>) tempList.stream().collect(Collectors.toMap(w -> w, Function.identity(), (a,b)->b));

        Iterator iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }


        /*List<String> filterList = (List<String>) tempList.stream().filter(ele -> !ele.equals("Apple")).collect(Collectors.toList());
        for(String list : filterList){
            System.out.println(list);
        }*/



        Map<String, Integer>fruitMap = new HashMap<>();
        for(int i=0;i<strArr.length;i++){

            if(fruitMap.containsKey(strArr[i])){
                Integer count = fruitMap.get(strArr[i]);
                count++;
                fruitMap.put(strArr[i],count);
            }else{
                fruitMap.put(strArr[i],1);
            }

        }


        //fruitMap.entrySet().stream().map().forEach(System.out::println);
        Iterator itr = fruitMap.entrySet().iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
