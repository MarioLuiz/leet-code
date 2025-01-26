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
       int priceBestDayToBuy = prices[0];
       int bestProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (priceBestDayToBuy > prices[i]) {
                priceBestDayToBuy = prices[i];
            }
            bestProfit = Math.max(bestProfit , (prices[i] - priceBestDayToBuy));
        }

        return bestProfit;
    }
}
