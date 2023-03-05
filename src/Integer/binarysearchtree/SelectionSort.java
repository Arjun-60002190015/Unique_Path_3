package Integer.binarysearchtree;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] vals){
        for(int i=0;i<vals.length;i++){
            int minIndex = i;
            for(int j=i+1;j<vals.length;j++){
                if(vals[j]<vals[minIndex]){
                    minIndex = j;
                }
            }
            if(i!= minIndex){
                int temp = vals[i];
                vals[i] = vals[minIndex];
                vals[minIndex] = temp;
                System.out.println(Arrays.toString(vals));
            }
        }

    }
    public static void main(String[] args){
        int[] arr  = {2,8,3,0,5};
        selectionSort(arr);
        System.out.println("Final Array is" + " " +  Arrays.toString(arr));
    }


}
