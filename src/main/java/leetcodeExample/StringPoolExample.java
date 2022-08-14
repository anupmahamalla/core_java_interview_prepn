package leetcodeExample;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StringPoolExample {
    public static void main(String[] args) {
        String name = new String("Anup");
        String name1= name;
        String name2 = "Anup";
        String name3 = name2;
        String name4= name1;
        String name5= name.intern();

        if(name5==name2 && name3==name5){
            System.out.println("Intern testing");
        }

        if(name5!=name && name4 == name1 ){
            System.out.println("Intern testing again");
        }

        Set set = new HashSet();

        set.add(name);
        set.add(name2);
        set.add(name3);
        set.add(name4);
        set.add(name5);
        set.add(null);

        for( Object str : set){
            System.out.println(str);
        }

        Set treeSet = new TreeSet();

        treeSet.add(name);
        treeSet.add(name2);
        treeSet.add(name3);
        treeSet.add(name4);
        treeSet.add(name5);
        treeSet.add(null);

        for( Object str1 : treeSet){
            System.out.println(str1);
        }


    }
}
