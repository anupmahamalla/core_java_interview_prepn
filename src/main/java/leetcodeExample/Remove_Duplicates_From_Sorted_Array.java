package leetcodeExample;

public class Remove_Duplicates_From_Sorted_Array {
    public static void main(String[] args) {
        //int []  nums = {0,0,1,1,1,2,2,3,3,4,5,5,8,8};
        int []  nums = {1,2,2,3,3,3,4,5,5,6,8,9,11,11,13};
        //removeDuplicatesAgain(nums);
        removeDuplicatesAgainWithReverse(nums);
        for(int num: nums){
            System.out.print(num +" ");
        }
    }
    public static  void  removeDuplicatesAgainWithReverse(int[] nums) {
        int left = nums.length-1;

        for(int i= nums.length-1; i > 0; i--){
            int num= nums[i];
            int preNum = nums[i-1];
            if(preNum==num){
                int j= i-1;
                while(j < left){
                    nums[j] = nums[j+1];
                    j++;
                }
                nums[left] = -1;
                left--;
            }
        }
    }

    public static void  removeDuplicatesAgain(int[] nums) {
        int first = 0;
        int second =1;
        while (second < nums.length){
            if(nums[second] > nums[first]){
                first++;
                nums[first] = nums[second];
            }else{
                second++;
            }
        }
    }

}
