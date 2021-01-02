package leetcode.DP;

public class problem121_买卖股票的最佳时机 {
    //    方法1 暴力
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxprofit) {
                    maxprofit = profit;
                }
            }
        }
        return maxprofit;
    }

    //    方法2 一次遍历，找到卖股票之前的最小值作为买股票的时间
    public int maxProfit2(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprifit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            } else if (prices[i] - minprice > maxprifit) {
                maxprifit = prices[i] - minprice;
            }
        }
        return maxprifit;
    }
}
