package medium;

import java.util.Arrays;
import java.util.stream.Stream;

//https://leetcode.com/problems/rotate-array/description/?envType=study-plan-v2&envId=top-interview-150
public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {-1,-100,3,99};
        int k = 2;
        int[] rodado = rotate(nums, k);
        System.out.println("Nums: " + Arrays.toString(rodado));
    }

    public static int[] rotate(int[] nums, int k) {
        int tamanhoArray = nums.length;
        int[] rotated = new int[tamanhoArray];
        k = k % tamanhoArray;
        int[] inicioNumsRodado = Arrays.copyOfRange(nums, (tamanhoArray - k), (tamanhoArray));
        int[] finalNumsRodado = Arrays.copyOfRange(nums, 0, tamanhoArray -k);

        rotated = Stream.concat(Arrays.stream(inicioNumsRodado).boxed(), Arrays.stream(finalNumsRodado).boxed())
                .mapToInt(Integer::intValue)
                .toArray();

        for (int i = 0; i < tamanhoArray; i++) {
            nums[i] = rotated[i];
        }
        return nums;
    }
}
