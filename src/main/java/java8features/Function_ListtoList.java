package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Function_ListtoList {
    public static void main (String [] args){

        Function_ListtoList obj = new Function_ListtoList();

        List<String> employeeList = Arrays.asList("anup","arvind", "manisha","mona","beena", "avika");

        List<String> alist = employeeList.stream().filter(x -> x.startsWith("a")).collect(Collectors.toList());

        System.out.println(alist);

        alist = obj.getListStartsWitha(employeeList, obj::getListwithStartwithA);

        System.out.println(alist);


    }

    public List<String> getListStartsWitha(List<String> list, Function<String,Boolean> function){

        List<String> alist = new ArrayList<String>();

        for(String str : list){
            boolean result = function.apply(str);
            if(result)
                alist.add(str);
        }

        return alist;

    }

    public List<String> getSameStringAsValue(List<String> list, Function<String,Boolean> function){

        List<String> alist = new ArrayList<String>();

        for(String str : list){
            boolean result = function.apply(str);
            if(result)
                alist.add(str);
        }

        return alist;

    }


    public boolean getListwithStartwithA(String str){
        return str.startsWith("a");
    }

    public String getSameStringAsValue(String str){
        return str;
    }


}
