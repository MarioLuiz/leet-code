package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/two-sum/
public class TwoSumMap {

	public static void main(String[] args) {
		int[] nums = {3,2,4}; 
		int target = 6;
		int[] result = twoSum(nums, target);
		System.out.println("Result: " + Arrays.toString(result));	
	}

	private static int[] twoSum(int[] nums, int target) {
		int len = nums.length;
		Map<Integer,Integer> mapNums = new HashMap();
		// preenchendo map (Chave será valor do elemento array, valor será posicao)
		for (int i = 0 ; i < len; i++) {
			mapNums.put(nums[i],i);
		}
		// verificando elementos do array
		for (int i = 0; i < len; i++) {
			// diferenca sera usada para achar soma que resulta no target
			int diferenca = target - nums[i];
			// diferença existe no map e se não de um indice repetido
			if (mapNums.containsKey(diferenca) && (int) mapNums.get(diferenca) != i) {
				return new int[]{i, (int) mapNums.get(diferenca)};
			}
		}
		// target not found
		return null;
	}
}

