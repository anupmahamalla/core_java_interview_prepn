package java8features;

import org.junit.jupiter.api.*;

class TwoSumTest {
    @BeforeAll
    static void setup(){
        System.out.println("@BeforeAll executed");
    }

    @BeforeEach
    void setupThis(){
        System.out.println("@BeforeEach executed");
    }

    @Tag("DEV")
    @Test
    void twoSum()
    {
        System.out.println("======TEST ONE EXECUTED=======");

        int[] nums = {15, 2, 7, 11, 15};
        int target = 13;
        int [] eresult = {1,3};
        int [] aresult = TwoSum.twoSum(nums,target);
        Assertions.assertEquals( eresult[0] ,aresult[0] );
        Assertions.assertEquals( eresult[1] ,aresult[1] );
    }

    @Tag("DEV")
    @Test
    void twoSumAgain()
    {
        System.out.println("======TEST ONE EXECUTED=======");

        int[] nums = {15, 2, 7, 11, 15};
        int target = 13;
        int [] eresult = {1,3};
        int [] aresult = TwoSum.twoSum1(nums,target);
        Assertions.assertEquals( eresult[0] ,aresult[0] );
        Assertions.assertEquals( eresult[1] ,aresult[1] );
    }

    @Test
    void twoSumVersionTwo()
    {
        System.out.println("======TEST TWO EXECUTED=======");
        int[] nums = {15, 2, 7, 11, 15};
        int target = 9;
        int [] eresult = {1,2};
        int [] aresult = TwoSum.twoSum(nums,target);
        Assertions.assertEquals( eresult[0] ,aresult[0] );
        Assertions.assertEquals( eresult[1] ,aresult[1] );
    }

    @Test
    void twoSumVersionTwoAgain()
    {
        System.out.println("======TEST TWO EXECUTED=======");
        int[] nums = {15, 2, 7, 11, 15};
        int target = 9;
        int [] eresult = {1,2};
        int [] aresult = TwoSum.twoSum1(nums,target);
        Assertions.assertEquals( eresult[0] ,aresult[0] );
        Assertions.assertEquals( eresult[1] ,aresult[1] );
    }

    @AfterEach
    void tearThis(){
        System.out.println("@AfterEach executed");
    }

    @AfterAll
    static void tear(){
        System.out.println("@AfterAll executed");
    }
}