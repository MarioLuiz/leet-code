package easy;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int repetidos = removeDuplicates(nums);
        System.out.println("Repetidos: " + repetidos);

    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0 ) return 0;

        int j = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return j;
    }
}
