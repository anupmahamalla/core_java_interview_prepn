package leetcodeExample;

import java.util.Arrays;

public class FindMaximumElementInArray {

    public static void main(String[] args) {

        int [] arr1 = {900,8, 10, 20, 80, 100, 200, 600,400, 500, 3, 100,2, 1};

        System.out.println("lenght is "+arr1.length);

        Arrays.sort(arr1);

        //method1(arr1);
        //System.out.printf("\n");
        method2(arr1);
        System.out.printf("\n");

        int [] arr2 = { 11, 5, 8, 4 , 1 ,2, 1, 3};
        //method1(arr2);
        System.out.println("\n");

        int [] arr3 = {10, 20, 30, 40, 50};
        //method1(arr3);

        System.out.println("\n");

        int [] arr4 = {1, 3, 50, 10, 9, 7, 6};
       // method1(arr4);
    }

    public static void method1(int [] arr1){
        boolean isGreater = false;
        int len = arr1.length;
        int maxelement = arr1[0];
        for(int i=1; i<len; i++){
            if(arr1[i] >maxelement){
                maxelement = arr1[i];
            }
        }
        System.out.printf ("Max element is %d", maxelement);
    }

    public static void method2(int [] arr1){

        //int maxelement = bsearch(arr1, 900 );
       // System.out.printf ("Max element is %d \n", maxelement);

        //int maxelement2 = bsearchForMax(arr1,900);
        //System.out.printf ("\nMax element is %d", maxelement2);

        for (int value: arr1)     System.out.print (value + " ");
        int maxelement3 = bsearchForMaxRecursive(arr1,0, arr1.length-1, 600);
        System.out.printf ("\nMax element is %d", maxelement3);
    }

    public static int bsearchForMaxRecursive(int [] arr, int lo, int hi, int searchValue){

        if(lo > hi ){
            return -1;
        }
        if(lo == hi){
            return  lo;
        }
        int mid = (lo + hi)/2;
        if(arr[mid] == searchValue)
            return mid;
        if(arr[mid] < searchValue){
            lo = mid +1;
        }else{
            hi = mid-1;
        }
        return bsearchForMaxRecursive(arr, lo, hi, searchValue);

    }


    public static int bsearchForMax(int [] arr, int searchValue){

        for (int value: arr)     System.out.print (value + " ");

        int lo = 0, hi = arr.length - 1;

        while(lo < hi){
            int mid = (lo + hi)/2;
            if(arr[mid] <= searchValue){
                lo = mid+1;
            }else{
                hi = mid;
            }
        }

        if(arr[lo] == searchValue){
            return lo;
        }else{
            return lo - 1;
        }
    }

    //1 2 3 4 5 6

        public static int bsearch(int[] arr, int key) {
        for (int value: arr)     System.out.print (value + " ");

            int lo = 0, hi = arr.length - 1;

            while (lo < hi) {
                int mid = (lo + hi) / 2;
                if (arr[mid] <= key)
                    lo = mid + 1;
                if (arr[mid] > key)
                    hi = mid;
            }

            if (arr[lo] == key) {
                return lo;
            }
            else {
                return lo - 1;
            }
        }
}
