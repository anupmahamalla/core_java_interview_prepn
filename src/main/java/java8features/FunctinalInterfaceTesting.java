package java8features;

@FunctionalInterface
interface Parent{
    public default void msg(String msg){
        System.out.println(msg);
    }
    public void parentmsg(String msg);

    public static  String test(String str){
        return str;
    }

}

//@FunctionalInterface
//Can not aanoate with FuncationalInterface as it will not accroding to java specifications
interface Child extends Parent{

    public String str ="";

    public default void msg(String msg){
        System.out.println(msg);
    }
    public void childMsg(String msg);

    public static  String test(String str){
        return str;
    }
}

class Boy implements Child{

    @Override
    public void parentmsg(String msg) {
        System.out.println(msg);
    }

    @Override
    public void childMsg(String msg) {
        System.out.println(msg);
    }
}

public class FunctinalInterfaceTesting {
    public static void main (String [] args){
        Parent parent = new Boy();
        parent.parentmsg("Hello Parent");

        Child child = new Boy();
        child.childMsg("Hello Child");
        Child.test("testing");
        //Child.str = "Juice"      variables in interfaces are implicitly final.
        child.parentmsg("Hello Parents form Boy");
    }

}


