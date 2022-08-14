package leetcodeExample;

public class Largest_Sum_Contiguous_Subarray {
    public static void main(String[] args) {
        int [] arr = {5,-4,-2,6,-1,2,5,};

        int maxsum=0;
        int currsum = 0;

        for(int i=0; i <arr.length;i++){
            currsum= currsum+arr[i];

            if(currsum > maxsum){
                maxsum = currsum;
            }

            if(currsum <0){
                currsum=0;
            }
        }

        System.out.println("Max SUm is " +maxsum);



    }
}
