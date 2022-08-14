package java8features.functionalInterface;

public class StaticandDefaultExamples extends StaticDemoClass implements ABC,XYZ{



    public static void main (String []args){
        ABC.staticMethodABC();
        XYZ.staticMethodXYZ();

        StaticandDefaultExamples obj = new StaticandDefaultExamples();
        obj.defaultMethodABC();
        obj.defaultMethodXYZ();

        StaticandDefaultExamples.staticDemoMethod();
    }

    @Override
    public void defaultMethodABC() {
        System.out.println(" Inside defaultMethod2");
    }

    @Override
    public void defaultMethod() {
        XYZ.super.defaultMethod();
        ABC.super.defaultMethod();
    }

    @Override
    public void defaultMethodXYZ() {
        XYZ.super.defaultMethodXYZ();
    }

    @Override
    public void abstractMethod() {
        System.out.println("This is abstractMethod from any of the classes");
    }
}

interface ABC{

    static void staticMethodABC(){
        System.out.println("This is staticMethodABC");
    }
    default void defaultMethodABC(){
        System.out.println("This is defaultMethod2 of ABC");
    }

    //commented below method to avoid compile time error for same default Method
    default void defaultMethod(){
        System.out.println("This is defaultMethod2 of ABC");
    }

    void abstractMethod();
}

interface XYZ{

    static void staticMethodXYZ(){
        System.out.println("This is staticMethodXYZ");
    }
    default void defaultMethodXYZ(){
        System.out.println("This is defaultMethod2 of XYZ");
    }
    default void defaultMethod(){
        System.out.println("This is defaultMethod2 of XYZ");
    }

    void abstractMethod();
}
