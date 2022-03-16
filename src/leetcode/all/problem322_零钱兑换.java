package leetcode.all;

import java.util.Arrays;

public class problem322_零钱兑换 {
    // 方法1 动态规划
    public int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            // 每局所有的子集，从子集中选择最小的
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        // 最后金额面值超过目标值，则不成兑换
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        problem322_零钱兑换 solution = new problem322_零钱兑换();
        int[] coins = new int[]{1, 2, 5};
        int amount = 11;
        System.out.println(solution.coinChange(coins, amount));
    }
}
