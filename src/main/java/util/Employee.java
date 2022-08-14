package util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Employee implements Comparable<Employee>, Serializable {
    private static String details= "This is Employee class";
    private String name;
    private String jobTitle;
    private int age;
    private int salary;
    private String department;
    private int joiningYear;
    private transient Address address;
    private String gender;

    @Override
    public int compareTo(Employee emp) {

        int result = this.name.compareTo(emp.name);

        if(result==0){
            if(this.getSalary() < emp.getSalary()){
                return -1;
            }else{
                return 1;
            }
        }else
        {
            return result;
        }
    }

    public Employee(String name, String jobTitle, int age, int salary, Address address) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.salary = salary;
        this.address = address;
    }

    public Employee(String name, String jobTitle, int age, int salary, String department, int joiningYear, Address address, String gender) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.salary = salary;
        this.department = department;
        this.joiningYear = joiningYear;
        this.address = address;
        this.gender = gender;
    }

    public Employee(String name, String jobTitle, int age, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.salary = salary;
    }





    public Employee(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getAge() == employee.getAge() && getSalary() == employee.getSalary() && getJoiningYear() == employee.getJoiningYear() && Objects.equals(getName(), employee.getName()) && Objects.equals(getJobTitle(), employee.getJobTitle()) && Objects.equals(getDepartment(), employee.getDepartment()) && Objects.equals(getAddress(), employee.getAddress()) && Objects.equals(getGender(), employee.getGender());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getJobTitle(), getAge(), getSalary(), getDepartment(), getJoiningYear(), getAddress(), getGender());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", joiningYear=" + joiningYear +
                ", address=" + address +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static String getDetails() {
        return details;
    }

    public static void setDetails(String details) {
        Employee.details = details;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getJoiningYear() {
        return joiningYear;
    }

    public void setJoiningYear(int joiningYear) {
        this.joiningYear = joiningYear;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Employee> getEmployeeList(){
        List<Employee> listEmployees = new ArrayList<Employee>();

        listEmployees.add(new Employee("Tamesh", "Developerr", 45, 8000, new Address("address1", "address2","landMark",41206,"Nagpur","maharashtra")));
        listEmployees.add(new Employee("Sampat", "Designer", 30, 7500));
        listEmployees.add(new Employee("Boban", "Designer", 45, 13400));
        //listEmployees.add(new Employee("Paresh", "Programmer", 25, 6000));
        listEmployees.add(new Employee("Titer", "Designer", 45, 13000));
        //listEmployees.add(new Employee("Craig", "Programmer", 30, 5200));
        listEmployees.add(new Employee("Annup", "Programmer", 25, 5500));
        listEmployees.add(new Employee("Annup", "Programmer", 25, 5100));
        listEmployees.add(new Employee("Alpan", "Designer", 30, 12000));
        listEmployees.add(new Employee("Birbal", "Programmer", 22, 3000));
        listEmployees.add(new Employee("Salman", "Developer", 28, 8000));
       // listEmployees.add(new Employee("Alhar", "Developer", 35, 14000));
        listEmployees.add(new Employee("John", "Developer", 35, 6700));
       // listEmployees.add(new Employee("Patnayak", "Developer", 35, 14000));
        listEmployees.add(new Employee("Alijan", "Programmer", 35, 8000));
        listEmployees.add(new Employee("Daulat", "Developer", 35, 9900));
        listEmployees.add(new Employee("Janvi", "Designer", 45, 8200));

        return listEmployees;
    }


    public List<Employee> getEmployeeListWithDepartmentAndDOJ(){
        List<Employee> listEmployees = new ArrayList<Employee>();

        listEmployees.add(new Employee("Tamesh", "Developerr", 45, 8000,"Admin", 2007, null, "Male" ));
        listEmployees.add(new Employee("Beena", "Designer", 30, 7500,"Management", 2010, null, "Female" ));
        listEmployees.add(new Employee("Boban", "Managing Director", 45, 13400,"Management", 2011, null, "Male" ));
        //listEmployees.add(new Employee("Paresh", "Programmer", 25, 6000));
        listEmployees.add(new Employee("Manisha", "Designer", 45, 13000,"Technology", 2013, null, "Female" ));
        //listEmployees.add(new Employee("Craig", "Programmer", 30, 5200,"Management", 2007, null, "Male" );
        listEmployees.add(new Employee("Annup", "Employee", 25, 5500,"HR", 2013, null, "Male" ));
        listEmployees.add(new Employee("Annup", "Programmer", 25, 5100,"Technology", 2015, null, "Male" ));
        listEmployees.add(new Employee("Alpan", "Designer", 30, 12000,"HR", 2015, null, "Male" ));
        listEmployees.add(new Employee("Mamta", "Programmer", 22, 3000,"HR", 2015, null, "Female" ));
        listEmployees.add(new Employee("Mukti", "Developer", 28, 8000,"Technology", 2017, null, "Female" ));
        listEmployees.add(new Employee("John", "Manager", 35, 6700,"HR", 2020, null, "Male" ));
        listEmployees.add(new Employee("Alijan", "Programmer", 35, 8000,"Technology", 2000, null, "Female" ));
        listEmployees.add(new Employee("Daulat", "Developer", 35, 9900,"Admin", 2001, null, "Male" ));
        listEmployees.add(new Employee("Janvi", "Designer", 45, 8200,"Technology", 1995, null, "Female" ));
        return listEmployees;
    }
}
