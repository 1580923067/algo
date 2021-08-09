package leetcode.all;

public class problem1277_统计全为1的正方形子矩阵 {
    public int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int dp[][] = new int[m + 1][n + 1];
        int res = 0;
        for (int i = 0; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (matrix[m][n] == 1) {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]);
                    if (matrix[i - 1 - dp[i][j]][j - 1 - dp[i][j]] == 1) {
                        dp[i][j]++;
                    }
                    res += dp[i][j];
                }
            }
        }
        return res;
    }
}
