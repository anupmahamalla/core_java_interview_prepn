package leetcodeExample;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumNumberOfCoinChangeTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    //@Disabled
    void coinChange() {

        int [] coins = {1,2,5} ;
        int num = 11;
        int count =  MinimumNumberOfCoinChange.coinChange(coins, num);
        assertEquals(3, count);

    }

    /**
     *  * Input: coins = [2], amount = 3
     *  * Output: -1
     */

    @Test
    @Disabled
    void coinChange2() {

        int [] coins = {2} ;
        int num = 3;
        int count =  MinimumNumberOfCoinChange.coinChange(coins, num);
        assertEquals(-1, count);

    }

    /**
    * Input: coins = [1], amount = 0
    * Output: 0
     * */

    @Test
    @Disabled
    void coinChange3() {

        int [] coins = {1} ;
        int num = 0;
        int count =  MinimumNumberOfCoinChange.coinChange(coins, num);

        assertEquals(0, count);

    }

    @Test
    @Disabled
    void coinChange4() {

        int [] coins = {186,419,83,408} ;
        int num = 6249;
        int count =  MinimumNumberOfCoinChange.coinChange(coins, num);

        assertEquals(20, count);

    }

}