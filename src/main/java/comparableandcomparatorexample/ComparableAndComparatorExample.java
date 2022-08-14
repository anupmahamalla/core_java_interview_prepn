package comparableandcomparatorexample;

// A Java program to demonstrate use of Comparable
import util.Employee;

import java.util.*;

public class ComparableAndComparatorExample {
    public static void main(String[] args) {
       List <Employee> list = new Employee().getEmployeeList();

        JobTitleAndSalaryComparator jtandSalcomp = new JobTitleAndSalaryComparator();

        Collections.sort(list);

        for(Employee Employee : list) {
            //System.out.println(Employee);
        }

        System.out.println("\n");

        Collections.sort(list,jtandSalcomp);
        for(Employee Employee : list) {
            //System.out.println(Employee);
        }


        List <Employee> newList = new Employee().getEmployeeList();

        Comparator jobTtileCompartor = Comparator.comparing(Employee :: getJobTitle);
        Comparator ageCompartor = Comparator.comparing(Employee :: getAge);

        Comparator jobTitleAgeComparator = jobTtileCompartor.thenComparing(ageCompartor);

        newList.stream().sorted().forEach(System.out::println);             System.out.println();

        newList.stream().sorted(jobTtileCompartor).forEach(System.out::println);            System.out.println();

        newList.stream().sorted(jobTitleAgeComparator).forEach(System.out::println);        System.out.println();


        //newStream.forEach(System.out::println);

    }
}



class AgeAndSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getAge() < o2.getAge()) {
            return -1;
        } else if (o1.getSalary() > o2.getSalary()) {
            return 1;
        } else {
            return 0;
        }
    }
}

class JobTitleAndSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int result = o1.getJobTitle().compareTo(o2.getJobTitle());
        if(result==0){
            if(o1.getSalary() < o2.getSalary()){
                return -1;
            }else{
                return 1;
            }
        }else
        {
            return result;
        }
    }
}






