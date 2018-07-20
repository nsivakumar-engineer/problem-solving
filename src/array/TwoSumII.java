package array;

import array.algorithms.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSumII {

    private static int[] twoSumII(int[] arr, int target){
        int i=0, j= arr.length-1;
        while(i < j) {
            int left = arr[i];
            int right = arr[j];
            int sum = arr[i] + arr[j];
            if(sum > target) {
                j--;
            } else if (sum < target) {
                i++;
            } else {
                return new int[] {i+1, j+1};
            }
        }

        return new int[] {-1, -1};
    }

    private static int[] twoSumIIBinarySearch(int arr[], int target) {
        for(int i=0; i < arr.length; i++) {
            int secondNumber = target - arr[i];
            int secondindex = BinarySearch.binarySearch(arr, secondNumber);

            if(secondindex != -1) {
                return new int[] {i + 1, secondindex + 1};
            }
        }

        return new int[] {-1, -1};
    }

    public static void main (String[] args){
        int[] arr = {4,3,7,5,13,11,2};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(TwoSumII.twoSumII(arr, 12)));
        System.out.println(Arrays.toString(TwoSumII.twoSumIIBinarySearch(arr, 12)));
    }
}
