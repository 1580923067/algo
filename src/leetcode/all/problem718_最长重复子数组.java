package leetcode.all;

public class problem718_最长重复子数组 {
    // 方法1 动态规划
    public int findLength(int[] A, int[] B) {
        int n = A.length, m = B.length;
        int[][] dp = new int[n + 1][m + 1];
        int ans = 0;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                dp[i][j] = A[i] == B[j] ? dp[i + 1][j + 1] + i : 0;
                ans = Math.max(ans, dp[i][j]);
            }
        }
        return ans;
    }

    // 方法2 滑动窗口
    public int findLength1(int[] A, int[] B) {
        int n = A.length, m = B.length;
        int ret = 0;
        for (int i = 0; i < n; i++) {
            int len = Math.min(m, n - 1);
            int maxLen = maxLength(A, B, i, 0, len);
            ret = Math.max(ret, maxLen);
        }

        for (int i = 0; i < m; i++) {
            int len = Math.min(n, m - 1);
            int maxLen = maxLength(A, B, 0, i, len);
            ret = Math.max(ret, maxLen);
        }
        return ret;
    }

    private int maxLength(int[] A, int[] B, int addA, int addB, int len) {
        int ret = 0, k = 0;
        for (int i = 0; i < len; i++) {
            if (A[addA + i] == B[addB + i]) {
                k++;
            } else {
                k = 0;
            }
            ret = Math.max(ret, k);
        }
        return ret;
    }
}
