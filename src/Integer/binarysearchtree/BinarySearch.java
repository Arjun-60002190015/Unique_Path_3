package Integer.binarysearchtree;

public class BinarySearch {
 /*   int binarySearch(int[] arr, int x){
        int low=0;
        int high = arr.length;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(x>arr[mid]){
              low = mid+1;
            }
            else if(x<arr[mid]){
                high = mid-1;
            }
            else
                return mid;

            }
        return -1;
            //else if(arr[mid])

    }*/
    int binarySearch(int[] arr, int x){
        int low=0;
        int high = arr.length;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(x>arr[mid]){
                low = mid+1;
            }
            else if(x<arr[mid]){
                high = mid-1;
            }
            else
                return mid;
        }
        return -1;
    }

    public static void main(String[] args){
        BinarySearch ob = new BinarySearch();
        int arr[] = {2, 3, 4, 5, 8, 1000};
        int x = 7;
        //int result;
        int result = ob.binarySearch(arr, x);
        if (result == -1) {
            System.out.println("invalid");

        } else {
            System.out.println(result);
        }
    }
}
