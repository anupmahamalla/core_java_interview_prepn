package leetcodeExample;

/**
 * 2,0,1,3,0,2,1,3,2,2,-1,1,3,2,0,1,-1,2
 *         0 - blue
 *         1 - green
 *         2 - red
 *         3 - yellow
 *                 -1 - invallid
 *
 *         1,3,0,2 -1  at the end
 *
 *         output:  1,1,1,1,1,3,3,3,0,0,0,2,2,2,2,2,2,,-1,-1
 *
 *         sequence_arr = {1,3,0,2,-1}
 *         data_arr = {2,0,1,3,0,2,1,3,2,2,-1,1,3,2,0,1,-1,2}
 *
 *         1,0,2,3,0,2,1,3,2,2,-1,1,3,2,0,1,-1,2
 *
 *         1,1,1,1,3,2,0,0,2,2,-1,2,3,2,0,3,-1,2
 *
 *         pointfor for sequencePointer=0:
 *         for(int i=0 ;i <sequence_arr;i++){
 *             for(for int j= sequencePointer; j <data_arr;j++)
 *             check [data_arr[j] == sequence_arr[i];
 *             temp = [data_arr[j];
 *             dataarr[sequencePointer]=sequence_arr[i]
 *                     [data_arr[j]=temp;
 *             sequencePointer++;
 *         }
 */

class SortArrayInSpecificOrder{
    public static void main(String[] args) {
        int [] numArr = {2,0,1,3,0,2,1,3,2,2,-1,1,3,2,0,1,-1,2};

        int [] seqArr = {1,3,0,2,-1};

        int pointer =0;
        for( int i=0; i <numArr.length;i++){
            for( int j=pointer; j <numArr.length;j++){
                if(numArr[j]==seqArr[i]){
                    int temp= numArr[j];
                    numArr[j] = numArr[pointer];
                    numArr[pointer] = temp;
                    pointer++;
                }
            }
        }

        for(Object object : numArr){
            System.out.print(object +" ");
        }
    }
}