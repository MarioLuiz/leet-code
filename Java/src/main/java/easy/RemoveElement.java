package easy;

import java.util.Arrays;

//https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150
public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        int result = removeElement(nums, val);
        System.out.println("Result: " + result);
    }
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
        }

        System.out.println("Array: " + Arrays.toString(nums));
        return index;
    }
}
