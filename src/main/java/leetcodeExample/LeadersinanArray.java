package leetcodeExample;

public class LeadersinanArray {

    public static void main(String[] args) {

        //int [] arr1 = { 11, 5, 8, 14 , 1 ,2, 1, 3};
        int [] arr1 = { 1, 2, 3, 4 , 5 ,6, 7, 8};

       // int[] arr1 = {8, 7, 6, 5, 4, 3, 2, 1};

        method1(arr1);
        System.out.println("\n");
        method2(arr1);
        System.out.println("\n");
        method3(arr1);
        System.out.println("\n");

        int [] arr2 = { 11, 5, 8, 4 , 1 ,2, 1, 3};
        method1(arr2);
        System.out.println("\n");
        method2(arr2);
        System.out.println("\n");
        method3(arr2);
    }

    public static void method3(int [] arr1) {
        boolean isGreater = false;
        int len = arr1.length;
        int maxValue =arr1[len-1];

        System.out.print (arr1[arr1.length-1] + " ");
        for (int i = len-2; i >= 0; i--) {
            int outerValue = arr1[i];
            if(outerValue > maxValue ){
                maxValue = outerValue;
                System.out.print (outerValue + " ");
            }
        }

    }

    public static void method2(int [] arr1) {
        boolean isGreater = false;
        int len = arr1.length;
        int maxValue =arr1[len-1];

        boolean newMax = true;

        System.out.print (arr1[arr1.length-1] + " ");
        for (int i = len-2; i >= 0; i--) {
            int outerValue = arr1[i];

            if(outerValue > maxValue ){
                newMax = true;
                maxValue = outerValue;
            }else{
                for (int j = i+1; j < len; j++) {
                    int innerValue = arr1[j];
                    if( outerValue < innerValue ){
                        maxValue = innerValue;
                        newMax = false;
                        break;
                    }
                    newMax = true;
                }
            }
            if(newMax){
                maxValue= outerValue;
                System.out.print (outerValue + " ");
            }
            //System.out.println("\n");
        }

    }



    public static void method1(int [] arr1){

        boolean isGreater = false;
        for(int i=0; i<arr1.length; i++){
            int num1 = arr1[i];
            isGreater  = false;

            for(int j=i+1; j<arr1.length;j++){
                int num2 = arr1[j];
                if(num1<num2){
                    isGreater = false;
                    break;
                }
                if(num1 > num2){
                    isGreater = true;
                }
            }
            if(isGreater){
                System.out.print (num1 +" ");
            }
        }
        System.out.print (arr1[arr1.length-1] +" ");
    }
    }
