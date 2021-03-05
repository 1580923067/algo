package leetcode.Array;

public class problem011_盛最多水的容器 {
    public int maxAera(int[] height) {
        int i = 0, j = height.length - 1, res = 0;
        while (i < j) {
            res = height[i] < height[j] ? Math.max(res, (j - i) * height[i++]) : Math.max(res, (j - i) * height[j--]);
        }
        return res;
    }

    public int maxAera2(int[] height) {
        int l = 0, r = height.length - 1;
        int ans = 0;
        while (l < r) {
            // 盛水量
            int aera = Math.min(height[l], height[r]) * (r - l);
            ans = Math.max(ans, aera);
            // 始终移动最小的一边
            if (height[l] <= height[r]) {
                ++l;
            } else {
                --r;
            }
        }
        return ans;
    }
}
