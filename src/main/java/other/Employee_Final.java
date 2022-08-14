package other;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Employee_Final implements Comparable<Employee_Final>, Serializable {
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
    public int compareTo(Employee_Final emp) {

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


    public Employee_Final(String name, String jobTitle, int age, int salary, Address address) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.salary = salary;
        this.address = address;
    }

    public Employee_Final(String name, String jobTitle, int age, int salary, String department, int joiningYear, Address address, String gender) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.salary = salary;
        this.department = department;
        this.joiningYear = joiningYear;
        this.address = address;
        this.gender = gender;
    }

    public Employee_Final(String name, String jobTitle, int age, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.salary = salary;
    }





    public Employee_Final(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee_Final)) return false;
        Employee_Final employeeFinal = (Employee_Final) o;
        return getAge() == employeeFinal.getAge() && getSalary() == employeeFinal.getSalary() && getJoiningYear() == employeeFinal.getJoiningYear() && Objects.equals(getName(), employeeFinal.getName()) && Objects.equals(getJobTitle(), employeeFinal.getJobTitle()) && Objects.equals(getDepartment(), employeeFinal.getDepartment()) && Objects.equals(getAddress(), employeeFinal.getAddress()) && Objects.equals(getGender(), employeeFinal.getGender());
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
        Employee_Final.details = details;
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

    public List<Employee_Final> getEmployeeList(){
        List<Employee_Final> listEmployeeFinals = new ArrayList<Employee_Final>();

        listEmployeeFinals.add(new Employee_Final("Tamesh", "Developerr", 45, 80000, new Address("address1", "address2","landMark",41206,"Nagpur","maharashtra")));
        listEmployeeFinals.add(new Employee_Final("Sampat", "Designer", 30, 75000));
        listEmployeeFinals.add(new Employee_Final("Boban", "Designer", 45, 134000));
        //listEmployees.add(new Employee("Paresh", "Programmer", 25, 60000));
        listEmployeeFinals.add(new Employee_Final("Titer", "Designer", 45, 130000));
        //listEmployees.add(new Employee("Craig", "Programmer", 30, 52000));
        listEmployeeFinals.add(new Employee_Final("Annup", "Programmer", 25, 55000));
        listEmployeeFinals.add(new Employee_Final("Annup", "Programmer", 25, 51000));
        listEmployeeFinals.add(new Employee_Final("Alpan", "Designer", 30, 120000));
        listEmployeeFinals.add(new Employee_Final("Birbal", "Programmer", 22, 30000));
        listEmployeeFinals.add(new Employee_Final("Salman", "Developer", 28, 80000));
       // listEmployees.add(new Employee("Alhar", "Developer", 35, 140000));
        listEmployeeFinals.add(new Employee_Final("John", "Developer", 35, 67000));
       // listEmployees.add(new Employee("Patnayak", "Developer", 35, 140000));
        listEmployeeFinals.add(new Employee_Final("Alijan", "Programmer", 35, 80000));
        listEmployeeFinals.add(new Employee_Final("Daulat", "Developer", 35, 99000));
        listEmployeeFinals.add(new Employee_Final("Janvi", "Designer", 45, 82000));

        return listEmployeeFinals;
    }


    public List<Employee_Final> getEmployeeListWithDepartmentAndDOJ(){
        List<Employee_Final> listEmployeeFinals = new ArrayList<Employee_Final>();

        listEmployeeFinals.add(new Employee_Final("Tamesh", "Developerr", 45, 80000,"Admin", 2007, null, "Male" ));
        listEmployeeFinals.add(new Employee_Final("Beena", "Designer", 30, 75000,"Management", 2010, null, "Female" ));
        listEmployeeFinals.add(new Employee_Final("Boban", "Designer", 45, 134000,"Management", 2011, null, "Male" ));
        //listEmployees.add(new Employee("Paresh", "Programmer", 25, 60000));
        listEmployeeFinals.add(new Employee_Final("Manisha", "Designer", 45, 130000,"Technology", 2013, null, "Female" ));
        //listEmployees.add(new Employee("Craig", "Programmer", 30, 52000,"Management", 2007, null, "Male" );
        listEmployeeFinals.add(new Employee_Final("Annup", "Programmer", 25, 55000,"HR", 2013, null, "Male" ));
        listEmployeeFinals.add(new Employee_Final("Annup", "Programmer", 25, 51000,"Technology", 2015, null, "Male" ));
        listEmployeeFinals.add(new Employee_Final("Alpan", "Designer", 30, 120000,"HR", 2015, null, "Male" ));
        listEmployeeFinals.add(new Employee_Final("Mamta", "Programmer", 22, 30000,"HR", 2015, null, "Female" ));
        listEmployeeFinals.add(new Employee_Final("Mukti", "Developer", 28, 80000,"Technology", 2017, null, "Female" ));
        listEmployeeFinals.add(new Employee_Final("John", "Developer", 35, 67000,"HR", 2020, null, "Male" ));
        listEmployeeFinals.add(new Employee_Final("Alijan", "Programmer", 35, 80000,"Technology", 2000, null, "Female" ));
        listEmployeeFinals.add(new Employee_Final("Daulat", "Developer", 35, 99000,"Admin", 2001, null, "Male" ));
        listEmployeeFinals.add(new Employee_Final("Janvi", "Designer", 45, 82000,"Technology", 1995, null, "Female" ));
        return listEmployeeFinals;
    }
}
