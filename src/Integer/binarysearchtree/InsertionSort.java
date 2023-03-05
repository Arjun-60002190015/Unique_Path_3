package Integer.binarysearchtree;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            int j = i-1;
            while(j>-1 && temp<arr[j]){
                arr[j+1] = arr[j];
                arr[j] = temp;
                j--;
                System.out.println(Arrays.toString(arr));
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {3,2,8,5,8};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
