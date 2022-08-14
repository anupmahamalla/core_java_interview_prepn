package serializableexamples;

import util.Employee;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class DeserializationExample {

        public static void main(String []args){

            try (FileInputStream fileInputStream = new FileInputStream("employee.txt")) {
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

                List employeeList = (List<Employee>)objectInputStream.readObject();

                for(Object employee : employeeList){
                    System.out.println(employee);
                }

                System.out.println(Employee.getDetails());

                fileInputStream.close();
                objectInputStream.close();


                System.out.println("Deserializable completed successfully");

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
