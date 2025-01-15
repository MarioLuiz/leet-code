package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,3,1,1,4,1,1,5,1,1,6};
        int majority = majorityElement(nums);
        System.out.println("Majority: " + majority);
    }

    public static int majorityElement(int[] nums) {
        //int majorityFrequency = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                int count = map.get(nums[i]);
                map.put(nums[i], count + 1);
            }
        }
        Integer valorMaior = null;
        Integer maior = null;
        Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> pairs = it.next();
            if (valorMaior == null || pairs.getValue() > valorMaior) {
                valorMaior = pairs.getValue();
                maior = pairs.getKey();
            }
        }
        return maior;
    }
}
