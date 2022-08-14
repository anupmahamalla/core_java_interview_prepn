package java8features;

import util.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;

public class GroupByExample {
    public static void main(String[] args) {
        List<Employee> employeeList = new Employee().getEmployeeList();

        Map<String, List<Employee>> listMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getJobTitle));


        final List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(2);
        System.out.println(list);


        List numlist = Arrays.asList(1,1,9,6,8,5,6,10,9);

        Optional p = numlist.stream().filter(a -> (int)a > 5).findFirst();


        IntStream.of(1,1,9,6,8,5,6,10,9).min().getAsInt();


        if(p.isPresent()){
            System.out.println(p.get());
        }

        for(Employee employee :employeeList ){
            System.out.println(employee);
        }

        for(Map.Entry<String, List<Employee>> employee : listMap.entrySet() ){
            System.out.println(employee);
        }

        List givenList = Arrays.asList("Anup", "Arvind", "Manisha");

        Map<Integer,String> result = (Map<Integer,String>) givenList.stream()
                .collect(toMap(Function.identity(), String::length));

        for(Map.Entry  entry: result.entrySet()){
            System.out.println(entry);
        }



    }
}
