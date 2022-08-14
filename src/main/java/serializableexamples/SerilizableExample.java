package serializableexamples;

import util.Address;
import util.Employee;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class SerilizableExample {

    private  static final Long  serialversionUID = 12345L;

    public static void main(String []args){
        Employee emp1 = new Employee();
        Address defaultAddress = new Address().getDefaultAddress();
        List<Employee> emplist = emp1.getEmployeeList();


        for(Employee emp: emplist){
            emp.setAddress(defaultAddress);
        }

        try (FileOutputStream fileOutputStream = new FileOutputStream("employee.txt")) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(emplist);
            System.out.println("Serializable completed successfully");

            objectOutputStream.flush();
            objectOutputStream.close();
            fileOutputStream.close();


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
