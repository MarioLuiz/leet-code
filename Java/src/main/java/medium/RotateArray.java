package medium;

import java.util.Arrays;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/?envType=study-plan-v2&envId=top-interview-150
public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = 3;
        int[] rodado = rotate(nums, k);
        System.out.println("Nums: " + Arrays.toString(rodado));
    }

    public static int[] rotate(int[] nums, int l) {

        for (int i = 0; i < l; i++) {
            for (int x = 0; x < nums.length; x++) {

            }
        }

        return nums;
    }
}
