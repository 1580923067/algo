package leetcode.all;

public class problem647_回文子串 {
    // 回文中心有一个字符和两个字符两种情况
    public int countSubstrings(String s) {
        int n = s.length(), ans = 0;
        for (int i = 0; i < 2 * n - 1; ++i) {
            int l = i / 2, r = i / 2 + i % 2;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                --l;
                ++r;
                ++ans;
            }
        }
        return ans;
    }

    // 动态规划
    public int countSubsrings1(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                if (s.charAt(j) == s.charAt(i) && i - j < 2 || dp[j + 1][i - 1]) {
                    dp[j][i] = true;
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        problem647_回文子串 solution = new problem647_回文子串();
        String s = "ababa";
        int totalNum = solution.countSubsrings1(s);
        System.out.println(totalNum);
    }
}

