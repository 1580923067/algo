package leetcode.all;

import java.util.HashMap;
import java.util.Map;

public class problem454_四数相加Ⅱ {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> countAB = new HashMap<>();
        for (int u : A) {
            for (int v : B) {
                // A[i]+B[j]的值放入hash映射表中，key是A[i]+B[j],value是出现的次数
                // 如果没有出现过A[i]+B[j],value=0+1;如果出现过则是次数+1
                countAB.put(u + v, countAB.getOrDefault(u + v, 0) + 1);
            }
        }

        int ans = 0;
        for (int u : C) {
            for (int v : D) {
                if (countAB.containsKey(-u - v)) {
                    ans += countAB.get(-u - v);
                }
            }
        }
        return ans;
    }
}
