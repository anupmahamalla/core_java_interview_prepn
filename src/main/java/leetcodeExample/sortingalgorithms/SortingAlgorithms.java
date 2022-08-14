package leetcodeExample.sortingalgorithms;

public class SortingAlgorithms {


    public static void main(String[] args) {
        int[] arr = {10, 1, 9, 7, 5, 6};
        //{ 10, 1,9,7,5,6}

    }

    public static void printArray(int[] arr) {
        System.out.print("\n");
        for (int ar : arr) {
            System.out.print(ar + " ");
        }
    }
}

class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {10, 1, 9, 7, 5, 6};
        insertionSort(arr);
        SortingAlgorithms.printArray(arr);
    }
    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int currVal = arr[i];
            int prevIndex = i - 1;
            while (prevIndex >= 0 && currVal < arr[prevIndex]) {
                arr[prevIndex + 1] = arr[prevIndex];
                prevIndex--;
            }
            arr[prevIndex + 1] = currVal;
        }
    }
}


class MergeSortExample {
    public static void main(String[] args) {
        int[] arr = {10, 1, 9, 7, 5, 6};
        mergeSort(arr);
        SortingAlgorithms.printArray(arr);
    }

    public static void mergeSort(int[] arr) {
        int len = arr.length;
        int ei = len - 1;
        int si = 0;
        devide(arr, si, ei);

    }

    public static void concur(int[] arr, int si, int mid, int ei) {
        int[] merged = new int[ei - si + 1];
        int index1 = si;
        int index2 = mid + 1;
        int x = 0;

        while (index1 <= mid && index2 <= ei) {
            if (arr[index1] < arr[index2]) {
                merged[x++] = arr[index1++];
            } else {
                merged[x++] = arr[index2++];
            }
        }

        while (index1 <= mid) {
            merged[x++] = arr[index1++];
        }
        while (index2 <= ei) {
            merged[x++] = arr[index2++];
        }
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void devide(int[] arr, int si, int ei) {

        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        devide(arr, si, mid);
        devide(arr, mid + 1, ei);
        concur(arr, si, mid, ei);
    }
}

class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {10, 1, 9, 7, 5, 6};
        bubbleSort(arr);
    }

    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                int first = arr[j], second = arr[j + 1];
                if (first > second) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}


class SelectionSort{
    public static void main(String[] args) {
        int[] arr = {10, 1, 9, 7, 5, 6};
        selectionSortNew(arr);
    }
    private static void selectionSortNew(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }

}
