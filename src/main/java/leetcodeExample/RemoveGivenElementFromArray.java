package leetcodeExample;


/*
Example 1:

Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).
 */


public class RemoveGivenElementFromArray {
    public static void main(String[] args) {

        int[] inputArr = {1,2,2,3,3,3,4,5,5,6,8,9,11,11,13};

        int Lpointer1 = inputArr.length - 1;
        for (int i = inputArr.length - 1; i > 0; i--) {
            int curr = inputArr[i];
            int prev = inputArr[i-1];
            if ( curr== prev) {
                int j = i-1;
                while (j < Lpointer1) {
                    inputArr[j] = inputArr[j+1];
                    j++;
                }
                inputArr[Lpointer1]=-1;
                Lpointer1--;
            }
        }


        for(int i :inputArr){
            System.out.print(i +" ");
        }
    }
}
