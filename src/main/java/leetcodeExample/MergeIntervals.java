package leetcodeExample;

import java.util.Arrays;
import java.util.LinkedList;

public class MergeIntervals {
    public static void main(String[] args) {
        //int [][] intervals = new int[2] [5];

        int[][] intervals = {{1, 5}, {6, 10}, {15, 17}, {4, 7}, {16, 20}};

        int [] [] newIntervals = mergeIntervals(intervals);

        printMergeArray(newIntervals);

        newIntervals = mergeIntervals2(intervals);

        printMergeArray(newIntervals);


    }

    private static void printMergeArray(int[][] newIntervals) {
        for(int [] interval : newIntervals){
            System.out.println(interval[0] + " "+interval[1]);
        }
    }

    private static int [] [] mergeIntervals(int[][] intervals) {

        LinkedList<int [] > mergedList = new LinkedList<>();
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0],b[0]));

        for(int [] interval : intervals){
            if(mergedList.isEmpty() || mergedList.getLast()[1] < interval[0]){
                mergedList.add(interval);
            }else{
                mergedList.getLast()[1] = Math.max(mergedList.getLast()[1],interval[1]);
            }
        }

        return  mergedList.toArray(new int[mergedList.size()][]);
    }

    private static int [] [] mergeIntervals2(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        LinkedList<int[]> mergeList = new LinkedList<>();

        for (int[] interval : intervals) {
            //System.out.println(interval[0] + " "+interval[1]);
            if(mergeList.isEmpty()  ||  interval[0] > mergeList.getLast()[1] ){
                mergeList.add(interval);
            }else{
                mergeList.getLast()[1] = Math.max(mergeList.getLast()[1],interval[1]);
            }
        }
        return  mergeList.toArray(new int [mergeList.size()][]);
    }


}



























