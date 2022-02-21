package leetcode.all;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class problem438_找到字符串中所有字母异位词 {
    public List<Integer> findAnagrams(String s, String p) {
        int sLen = s.length(), pLen = p.length();
        // 如果p比s长，返回空数组
        if (sLen < pLen) {
            return new ArrayList<Integer>();
        }

        List<Integer> ans = new ArrayList<>();
        int[] sCount = new int[26];
        int[] pCount = new int[26];
        // 比较开始位置是否满足条件
        for (int i = 0; i < pLen; ++i) {
            ++sCount[s.charAt(i) - 'a'];
            ++pCount[p.charAt(i) - 'a'];
        }
        if (Arrays.equals(sCount, pCount)) {
            ans.add(0);
        }
        // 滑动窗口，左边去掉一个，右边增加一个
        for (int i = 0; i < sLen - pLen; ++i) {
            --sCount[s.charAt(i) - 'a'];
            ++sCount[s.charAt(i + pLen) - 'a'];
            if (Arrays.equals(sCount, pCount)) {
                ans.add(i + 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        problem438_找到字符串中所有字母异位词 solution = new problem438_找到字符串中所有字母异位词();
        String s = "cbaebabacd", p = "abc";
        List<Integer> ans = solution.findAnagrams(s, p);
        System.out.println(ans);
    }
}
