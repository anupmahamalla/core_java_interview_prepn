package java8features;


import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */

public class TwoSum {
    public static void main(String[] args) {
        int [] nums = {12,28,6,2,7,11,15};
        int target = 9;

        int [] result = twoSum(nums, target);

        for(int num : result){
            System.out.println(num);
        }
    }



    public static int[] twoSum1(int[] nums, int target) {
        Map<Integer, Integer> tempMap = new HashMap<>();
        int [] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target) {
                int newTarget = target-nums[i];
                if(tempMap.containsKey(newTarget)){
                    result[1]= i;
                    result[0] = tempMap.get(newTarget);
                    break;
                }else{
                    tempMap.put(nums[i], i);
                }
            }
        }
        return result;
    }

    public static int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target) {
                int temp = nums[i];
                int j = i + 1;
                int newTarget = target - temp;
                while (j < nums.length) {
                    if (nums[j] == newTarget) {
                        result[0]=i;
                        result[1]=j;
                        break;
                    }
                    j++;
                }
            }
        }
        return result;
    }



}
