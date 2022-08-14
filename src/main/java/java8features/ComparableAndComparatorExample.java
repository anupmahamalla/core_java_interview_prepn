package java8features;

import util.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparableAndComparatorExample {
    public static void main(String[] args) {

        List<Employee> employeeList = new Employee().getEmployeeList();

        EmployeeNameComparator emcomp = new EmployeeNameComparator();
        employeeList.stream().sorted(emcomp).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("\n");

        employeeList.stream().sorted((e1,e2) ->e1.getName().compareTo(e2.getName())).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("\n");

        employeeList.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("\n");

    }
}

class EmployeeNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }

    @Override
    public Comparator reversed() {
        return Comparator.super.reversed();
    }

}
