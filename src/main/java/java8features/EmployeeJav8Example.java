package java8features;

import util.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeJav8Example {

    public static void main(String[] args) {
        List<Employee> employeeList  = new Employee().getEmployeeListWithDepartmentAndDOJ();

        for(Employee employee : employeeList){
            System.out.println(employee);
        }
        System.out.println("\n\n");

        //Get Details of Highest Paid Employee;
       // highestPaidEmplayeeName(employeeList);

        //List of Employee who joined after 2014
        //emplayeeNameWhoJoinedAfter2014(employeeList);

        //Name of Male and Female Employee in Set Formate
        //nameOfMaleAndFemaleEmployee(employeeList);

        //Numbers of Male and Female Employee
        //numberOfMaleAndFemaleEmployee(employeeList);

        //Get the Average Salary
        //System.out.println(employeeList.stream().collect(Collectors.averagingDouble(emp ->emp.getSalary())));

        //Name of Employee in HR the department
        /*employeeList.stream()
                .filter(employee -> employee.getDepartment().equals("HR"))
                .map(employee -> employee.getName())
                .collect(Collectors.toList())
                .forEach(System.out::println);*/


        //Sort Employee with Jobtitle and then Age and then Department
        /*employeeList.stream().sorted(Comparator.comparing(Employee::getJobTitle)
                .thenComparing(Comparator.comparing(Employee::getAge))
                .thenComparing(Comparator.comparing(Employee::getDepartment)))
                .collect(Collectors.toList()).forEach(System.out::println);*/



        //Name of all department

     /*  Comparator<String> lenComp = (a, b) -> a.length() -b.length();
        Comparator<String> naturalComp = (a, b) -> a.compareTo(b);

        employeeList.stream()
                .map(employee -> employee.getDepartment())
                .distinct()
                .sorted( lenComp )
                .sorted(naturalComp.reversed())
                .collect(Collectors.toList())
                .forEach(System.out::println);*/






        //Average salary of Male and female
        averageAgeOfMaleAndFemaleEmployee(employeeList);
        //Average salary of Each Department

        //Who has the most working Experience

        //Details of youngest female employee from HR Department
        Optional <Employee> emp = employeeList.stream().
                filter(employee -> employee.getDepartment().equals("HR"))
                .sorted(Comparator.comparing(Employee::getAge)).findFirst();
        if(emp.isPresent())
            //System.out.println(emp.get());

        //Details of All the youngest Male and Female employee from All  Department
        //allTheYoungestMaleAndFemaleEmployeeFromAllTheDepartment(employeeList);


        //Average age of Employee
        //System.out.println("Average Age of Employee is "+
                   // employeeList.stream().collect(Collectors.averagingDouble(Employee::getAge)));


        // Find Details of Employee who has 3rd Highest Salary
        //findEmployeeHaving3rdHighestSalary(employeeList);


        //https://www.youtube.com/watch?v=4qnT-ya9HGk&ab_channel=InterviewMania

        System.out.println("\n\n");


    }

    private static void averageAgeOfMaleAndFemaleEmployee(List<Employee> employeeList) {
        Map <String, List<Employee>> tempMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender));
        for(Map.Entry entry:tempMap.entrySet()){
            List<Employee> tempList = (List<Employee>)entry.getValue();
            Double avgAgeofMale = tempList.stream().collect(Collectors.averagingInt(Employee::getAge));
            System.out.println("Average Age of "+ tempList.get(0).getGender() +" "+ avgAgeofMale);
        }

        System.out.println("Average Age of Female is "+
                employeeList.stream().filter(e -> e.getGender().equals("Female")).collect(Collectors.averagingInt(Employee::getAge)));

        System.out.println("Average Age of Male is "+
                employeeList.stream().filter(e -> e.getGender().equals("Male")).collect(Collectors.averagingInt(Employee::getAge)));

        System.out.println("Average Age of Male is "+
                employeeList.stream().filter(e -> e.getDepartment().equals("HR")).
                        filter(e -> e.getGender().equals("Male"))
                        .collect(Collectors.averagingInt(Employee::getAge)));

    }

    private static void allTheYoungestMaleAndFemaleEmployeeFromAllTheDepartment(List<Employee> employeeList) {
       Map<String,List<Employee>> deptEmpMap =  employeeList.stream()
               .collect(Collectors.groupingBy(Employee::getDepartment));
        for(Map.Entry entry: deptEmpMap.entrySet()){
            List<Employee> lst = (List<Employee>)entry.getValue();
            Map<String,List<Employee>> genderEmpMap = lst.stream().collect(Collectors.groupingBy(Employee::getGender));
            for(Map.Entry ent: genderEmpMap.entrySet()){
                List<Employee> lst1 = (List<Employee>)ent.getValue();
                lst1.stream()
                        .sorted(Comparator.comparing(Employee::getAge))
                        .limit(1)
                        //.map(Employee::getName)
                        .forEach( emp -> System.out.println(emp.getName()
                                + " "+emp.getAge() + " "+ emp.getGender() + " "+emp.getDepartment()));
            }
        }
    }

    private static void findEmployeeHaving3rdHighestSalary(List<Employee> employeeList) {
        Optional<String> thirdHighestEmployee = employeeList.stream().max(Comparator.comparing(Employee::getSalary)).map(Employee::getName);
        if(thirdHighestEmployee.isPresent())
            System.out.println(thirdHighestEmployee.get());

        employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList()).forEach(System.out::println);

        Employee emp =
                employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList()).get(2);
        System.out.println("\n"+emp);

        employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(2).limit(2).forEach(System.out::println);
    }


    private static void nameOfMaleAndFemaleEmployee(List<Employee> employeeList) {

        Map<String, Set<String>> genderDetails = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.mapping(emp -> emp.getName(),Collectors.toSet())));


        Map<String, List<String>> genderDetailsWithList = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.mapping(Employee::getName,Collectors.toList())));

        for(Map.Entry entry : genderDetails.entrySet()){
            System.out.println(entry.getKey() + " " +entry.getValue());
        }

        for (Map.Entry entry : genderDetailsWithList.entrySet()){
            System.out.println(entry.getKey() + " " +entry.getValue());
        }

    }

    private static void numberOfMaleAndFemaleEmployee(List<Employee> employeeList) {
        Map<String, Long> genderDetails = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));

        for(Map.Entry entry : genderDetails.entrySet()){
            System.out.println(entry.getKey() + " " +entry.getValue());
        }
    }

    private static void emplayeeNameWhoJoinedAfter2014(List<Employee> employeeList) {

        long employeeCountafter2014 = employeeList.stream().filter(emp -> emp.getJoiningYear() >2014).count();
        List<String> employeeCountAfter2014List = employeeList.stream()
                .filter(emp -> emp.getJoiningYear() >2014)
                .map( emp -> emp.getName()).collect(Collectors.toList());
        System.out.println("Employee who joined after 2014 "+employeeCountAfter2014List );
    }

    private static void highestPaidEmplayeeName(List<Employee> employeeList) {

        String highestPaidEmplyee = employeeList.stream().max(Comparator.comparing(Employee::getSalary)).get().getName();
        Optional highestPaidEmplyeeOptional = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        //if(highestPaidEmplyee.equals(highestPaidEmplyeeOptional.get().toString()))
        System.out.println("Highest Paid Employee is "+highestPaidEmplyee );
        System.out.println(highestPaidEmplyeeOptional.get());
    }
}
