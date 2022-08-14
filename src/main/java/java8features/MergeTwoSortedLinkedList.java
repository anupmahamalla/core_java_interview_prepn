package java8features;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MergeTwoSortedLinkedList {
    public static void main(String[] args) {
        LinkedList <Integer> flist = new LinkedList<>();
        flist.add(1);
        flist.add(5);
        flist.add(7);
        flist.add(9);

        List<Integer> slist = new LinkedList<>();
        slist.add(1);
        slist.add(2);
        slist.add(8);
        slist.add(12);

        Integer i1=128;
        Integer i2=128;
        System.out.println(i1==i2);

        int i3=128;
        int i4=128;

        int r = 10 + +11;

        Collections.unmodifiableList(flist);


        System.out.println(i3==i4);




    }


}
