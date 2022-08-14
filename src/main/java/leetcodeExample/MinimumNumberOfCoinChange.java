package leetcodeExample;


/**
 * You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.
 *
 * Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
 *
 * You may assume that you have an infinite number of each kind of coin.
 *
 *
 *
 * Example 1:
 *
 * Input: coins = [1,2,5], amount = 11
 * Output: 3
 * Explanation: 11 = 5 + 5 + 1
 * Example 2:
 *
 * Input: coins = [2], amount = 3
 * Output: -1
 * Example 3:
 *
 * Input: coins = [1], amount = 0
 * Output: 0
 *
 */

public class MinimumNumberOfCoinChange {

    public static void main(String[] args) {
        int [] coins = {1,2,5} ;
        int num = 11;

        int numCoin = coinChange(coins, num);
    }


    public static int coinChange(int[] coins, int amount) {
        int minCoins = subsetmin(coins, amount, coins.length);
        return minCoins == Integer.MAX_VALUE - 1 ? -1 : minCoins;
    }
    public static int subsetmin(int coins[], int sum, int n){
        if(n == 0 && sum != 0) return Integer.MAX_VALUE - 1;
        if(sum == 0) return 0;

        if(coins[n - 1] <= sum){
            int result1 = subsetmin(coins, sum - coins[n - 1], n) + 1;
            int result2 = subsetmin(coins, sum, n - 1);

            return Math.min(result1,result2 );
        }
        else{
            return subsetmin(coins, sum, n - 1);
        }
    }



}


