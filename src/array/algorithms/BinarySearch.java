package array.algorithms;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target){
        //return binarySearchUtilRecursive(arr, target, 0, arr.length-1 );
        return binarySearchIterative(arr, target);
    }

    private static int binarySearchUtilRecursive(int[] arr, int target, int start, int end){
        while(start < end) {
            int mid = (start + end)/2;
            if(target < arr[mid]){
                return binarySearchUtilRecursive(arr, target, start, mid-1);
            } else if(target > arr[mid]){
                return binarySearchUtilRecursive(arr, target, mid+1, end);
            } else {
                return mid;
            }
        }

        return ((start == end && arr[start] == target)? start : -1);
    }

    private static int binarySearchIterative(int[] arr, int target){
        int start = 0, end = arr.length - 1;
        while(start < end) {
            int mid = (start + end)/2;
            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return ((start == end) && (arr[start] == target)? start : -1);
    }

    public static void main(String[] args){
        int[] arr = {1,3,5,7,9,23,45,67,99,120};
        // Edge cases
        int[] arr1 = {22}; // Only one element
        int[] arr2 = {23};
        System.out.println(binarySearch(arr,99));
        System.out.println(binarySearch(arr1,22));
        System.out.println(binarySearch(arr2,22));
    }
}
