package leetcodeExample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class SearchInsertPositionTest {

    @Test
    public  void test1(){
        int [] arr={1,3,5,6};
        int target = 5;
        assertEquals( 2,SearchInsertPosition.searchInsert2(arr,target));
    }

    @Test
    public  void test2(){
        int [] arr={1,3,5,6};
        int target = 2;
        assertEquals( 1,SearchInsertPosition.searchInsert2(arr,target));
    }


    @Test
    public  void test3(){
        int [] arr={1,3,5,6};
        int target = 7;
        assertEquals( 4,SearchInsertPosition.searchInsert2(arr,target));
    }

    @Test
    public  void test4(){
        int [] arr={1,3,5,6};
        int target = 0;
        assertEquals( 0,SearchInsertPosition.searchInsert2(arr,target));
    }

}