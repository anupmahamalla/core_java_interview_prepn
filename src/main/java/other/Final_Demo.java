package other;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Final_Demo {


    public static void main(String[] args) {
        final Employee_Final employeeFinal = new Employee_Final("Tamesh", "Developerr", 45, 80000,
                "Admin", 2007, null, "Male" );


        Address address = new Address();

        //employeeFinal.setName("Anup");

        //employeeFinal.setAddress(address);
        //employeeFinal.getAddress().setCity("Nagpur");

        System.out.println(employeeFinal);

        //below code is not allowed for final class
        //employeeFinal = new Employee_Final("Tamesh", "Developerr", 45, 80000,"Admin", 2007, null, "Male" );



        final List myList = new ArrayList();
        myList.add("one");
        myList.add("two");
        myList.add("three");

        System.out.println(myList);

        List tmp = new ArrayList();
        tmp.add("four");

      //  myList = tmp; // Throws Compilation error
      //  myList = null;

         int temp=0;


        final Employee_Final employeeFinal2 = new Employee_Final("Tamesh", "Developerr", 45, 80000,
                "Admin", 2007, null, "Male" );

        final Employee_Final employeeFina32 = new Employee_Final("Tamesh", "Developerr", 45, 80000,
                "Admin", 2007, null, "Male" );

        Map<Employee_Final, Employee_Final> map = new HashMap<>();

        map.put(employeeFina32, employeeFina32);
        map.put(employeeFinal2, employeeFinal2);
        map.put(employeeFinal, employeeFinal);

        for( Map.Entry entry: map.entrySet()){
            System.out.println(entry.getKey().hashCode());
        }




    }
}


