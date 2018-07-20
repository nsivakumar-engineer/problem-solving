package array;

import java.util.HashMap;
import java.util.Map;

public class TwoSumIII {
    private HashMap<Integer, Integer> map = new HashMap<>();

    public void add(int input) {
        if(map.containsKey(input)){
            map.put(input, map.get(input) + 1);
        } else {
            map.put(input, 0);
        }
    }

    public boolean find(int value) {
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            int secondVal = value - entry.getKey();
            if(map.containsKey(secondVal)) {
                return (secondVal != value || map.get(secondVal) > 1); //Dealing with potential duplicates
            }
        }
        return false;
    }

    public static void main (String[] args){
        TwoSumIII twoSum = new TwoSumIII();
        twoSum.add(14); twoSum.add(3); twoSum.add(7); twoSum.add(12); twoSum.add(14); twoSum.add(8);
        System.out.println(twoSum.find(28));
    }
}
