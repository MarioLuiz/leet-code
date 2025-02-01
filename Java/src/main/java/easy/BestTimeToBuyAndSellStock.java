package easy;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/?envType=study-plan-v2&envId=top-interview-150
public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        int x = maxProfit(nums);
        System.out.println("maxProfit: " + x);
    }

    public static int maxProfit(int[] prices) {
        int totalProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                totalProfit += prices[i] - prices[i - 1];
            }
        }
        return totalProfit;
    }
}
