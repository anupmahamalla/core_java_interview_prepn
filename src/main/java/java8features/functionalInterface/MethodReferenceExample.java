package java8features.functionalInterface;

public class MethodReferenceExample {


    public static void main (String []args){

        FunctionalInterfaceDemo d = () -> System.out.println("THis is testing");

        d.defaultDemo();
        d.demo();

        FunctionalInterfaceDemo f = TestClass::showTestClass;
        f.demo();

    }




}


class TestClass {
    public static void showTestClass(){
        System.out.println("THis is TestClass");
    }
}

@FunctionalInterface
interface FunctionalInterfaceDemo{

    public void demo();

    default  void defaultDemo(){
        System.out.println("This is test demo");
    }
}
