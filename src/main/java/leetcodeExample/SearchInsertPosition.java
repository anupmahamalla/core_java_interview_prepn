package leetcodeExample;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int [] arr={1,3,5,6};
        int target = 5;
        System.out.println ( searchInsert2(arr,target));
    }

    public static int searchInsert2(int[] nums, int target) {
        int result =-1;

        int left =0;
        int right = nums.length-1;

        while(left <=right){
            int middle = (left+right) /2;
            int middleValue =nums[middle];
            if(middleValue == target){
                return middle;
            }else if(target > middleValue ){
                left = middle+1;
            }else{
                right = middle-1;
            }
        }

        return left;
    }


    public static int searchInsert1(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            int num = nums[middle];
            if (target == num) return middle;
            else if (target > num) left = middle + 1;
            else right = middle - 1;
        }
        return left;
    }


    public static int searchInsert(int[] nums, int target) {
        int result =-1;

        int greaterIndex = -1;
        int lessIndex = -1;

        for(int num =0; num < nums.length;num++){

            if( target < nums[0] ){
                result = 0;
                break;
            }

            if(nums[num] < target){
                lessIndex= num;
            }else if(nums[num] > target){
                greaterIndex= num;
            }else if (nums[num] == target){
                result =  num;
                break;
            }

            if(lessIndex >= 0 && greaterIndex >=0 && result==-1){
                result = lessIndex+1;
            }

        }
        if(result ==-1){
            result = nums.length;
        }
        return result;
    }
}
