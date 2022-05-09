package leetcode.all;

import java.util.Arrays;

public class problem942_增减字符串匹配 {
    public int[] diStringMatch(String s) {
        int n = s.length(), lo = 0, hi = n;
        int[] perm = new int[n + 1];
        for (int i = 0; i < n; i++) {
            perm[i] = s.charAt(i) == 'I' ? lo++ : hi--;
        }
        perm[n] = lo;
        return perm;
    }

    public static void main(String[] args) {
        problem942_增减字符串匹配 solution = new problem942_增减字符串匹配();
        int[] res = solution.diStringMatch("IDID");
        System.out.println(Arrays.toString(res));
    }
}
