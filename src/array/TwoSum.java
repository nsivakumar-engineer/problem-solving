package array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    private static int[] twoSum(int[] numbers, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i< numbers.length; i++) {
            int secondNumberValue = target - numbers[i];
            if(map.containsKey(secondNumberValue)){
                return new int[] {map.get(secondNumberValue) + 1, i + 1};
            }

            map.put(numbers[i], i);
        }

        throw new IllegalArgumentException("No two numbers sum to target");
        //return new int[] {-1,-1};
    }
    public static void main (String[] args){
        int[] arr = {4,3,7,5,8,9,2};
        System.out.println(Arrays.toString(TwoSum.twoSum(arr, 10)));
    }
}
