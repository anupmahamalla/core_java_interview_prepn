package leetcodeExample;

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
 * representing the number of elements in nums1 and nums2 respectively.
 *
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 *
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
 * To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
 * and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 */

public class MergeSortedArray {
    public static void main(String[] args) {
       int [] nums1= {1,2,3,0,0,0,0} , nums2= {2,5,6,9};  int m=3, n=4;

        //int [] nums1= {0} , nums2= {1};  int m=0, n=1;

        //int [] nums1= {1} , nums2= {0};  int m=1, n=0;

        //int [] nums1= {2,0} , nums2= {1};  int m=1, n=1;

        //nums1= merge2(nums1, m,nums2, n);
        //merg3(nums1, nums2, m, n);
        //printArray(nums1);

        merg2(nums1, nums2, m, n);
        printArray(nums1);

    }

    private static void merg2(int[] nums1, int[] nums2, int m, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int i = m+n-1;

        while(p2>=0){
            if(p1>=0 && nums1[p1] > nums2[p2]){
                nums1[i] = nums1[p1];
                i--;
                p1--;
            }else{
                nums1[i] = nums2[p2];
                i--;
                p2--;
            }
        }
    }



    private static void merg3(int[] nums1, int[] nums2, int m, int n) {
        int i=0, j=0,k = 0;
        int [] tempArray= new int [m+n];

        System.arraycopy(nums1, 0, tempArray, 0, nums1.length);

        if (m == 0 && n !=0) {
            for(int x = 0; x< n; x++){
                nums1[x] = nums2[x];
            }
        }else if(n == 0 && m !=0){

        }else{
            while(i < m + n) {
                if( j < m &&  k < n && tempArray[j] <= nums2[k] ){
                    nums1[i]=tempArray[j];
                    j++;
                }
                else if (j < m &&  k < n && tempArray[j] > nums2[k]) {
                    nums1[i]= nums2[k];
                    k++;
                }
                else  if( j < m){
                    nums1[i]=tempArray[j];
                    j++;
                }
                else  if(k < n){
                    nums1[i]= nums2[k];
                    k++;
                }
                 i++;
            }
        }
    }





    public static int []  merge2(int [] nums1, int m, int [] nums2, int n) {
        int i=0, temparr = m+n;
        int j=0,k = 0;
        int [] tempArray= new int [temparr];

        if (m == 0 && n !=0) {
            for(int x = 0; x<n;x++){
                nums1[x] = nums2[i];
            }
        }else if(n == 0 && m !=0){

        }else{
            while(i < m+n) {
                if( j < m && nums1[j] <= nums2[k] ){
                    tempArray[i]=nums1[j];
                    j++;
                }else {
                    tempArray[i]=nums2[k];
                    k++;
                }
                i++;
            }
        }
        return tempArray;
    }

    public static void merge(int [] nums1, int m, int [] nums2, int n) {
        int i=0, temparr = m+n;
        int j=0,k = 0;
        int [] tempArray= new int [temparr];

        if (m == 0 && n !=0) {
            for(int x = 0; x<n;x++){
                nums1[x] = nums2[i];
            }
        }else if(n == 0 && m !=0){

        }else{
            while(i < m+n) {
                if( j < m && nums1[j] <= nums2[k] ){
                    nums1[i]=nums1[j];
                    j++;
                }else {
                    nums1[i]=nums2[k];
                    k++;
                }
               i++;
            }
        }
    }

        public static void printArray (int [] arr) {
            System.out.print("\n");
            for(int ar : arr){
                System.out.print(ar + " ");
            }
        }
}
