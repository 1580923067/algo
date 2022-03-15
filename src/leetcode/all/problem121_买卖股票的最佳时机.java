package leetcode.all;

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

    // 动态规划
/*    推导状态转移方程：

    dp[i][0]：规定了今天不持股，有以下两种情况：

    昨天不持股，今天什么都不做；
    昨天持股，今天卖出股票（现金数增加），
    dp[i][1]：规定了今天持股，有以下两种情况：

    昨天持股，今天什么都不做（现金数与昨天一样）；
    昨天不持股，今天买入股票（注意：只允许交易一次，因此手上的现金数就是当天的股价的相反数）。*/

    public int maxProfit3(int[] prices) {
        int len = prices.length;
        if (len < 2) {
            return 0;
        }

        int[][] dp = new int[len][2];
        // dp[i][0]下标为i这天结束的时候，不持股，手上拥有的现金数
        // dp[i][1]下标为i这天结束的时候，持股，手上拥有的现金数
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < len; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], -prices[i]);
        }
        return dp[len - 1][0];
    }

    public static void main(String[] args) {
        problem121_买卖股票的最佳时机 solution = new problem121_买卖股票的最佳时机();
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(solution.maxProfit3(prices));
    }
}
