package easy;

import java.util.Arrays;
// https://leetcode.com/problems/two-sum/
public class TwoSumForcaBruta {

	public static void main(String[] args) {
		int[] nums = {3,2,4}; 
		int target = 6;
		int[] result = twoSum(nums, target);
		System.out.println("Result: " + Arrays.toString(result));	
	}

	private static int[] twoSum(int[] nums, int target) {
		int orinalLenght = nums.length;
		// Primeiro laco itero sobre o array do primeiro elemento até penultimo elemento
		for (int i = 0; i < orinalLenght - 1; i++) {
			// Segundo laco itero sobre o array do 2 elemento até o ultimo elemento
			for (int j = i + 1; j < orinalLenght; j++) {
				if((nums[i] + nums[j]) == target) {
					System.out.println("i = "+ i + " j = " + j);
					return new int[] {i,j};
				}
			}
		}
		return null;
	}
}

