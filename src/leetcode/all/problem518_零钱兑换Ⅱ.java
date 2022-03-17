package leetcode.all;

public class problem518_零钱兑换Ⅱ {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        // 初始化数组，当金额为0，有一种方案
        dp[0] = 1;
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] += dp[i - coin];
            }
        }
        return dp[amount];
    }

    public static void main(String[] args) {
        problem518_零钱兑换Ⅱ solution = new problem518_零钱兑换Ⅱ();
        int[] coins = new int[]{1, 2, 5};
        int amount = 5;
        System.out.println(solution.change(amount, coins));
    }
}
