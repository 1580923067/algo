package leetcode.all;

public class problem011_盛最多水的容器 {
    public int maxAera(int[] height) {
        int i = 0, j = height.length - 1, res = 0;
        while (i < j) {
            res = height[i] < height[j] ? Math.max(res, (j - i) * height[i++]) : Math.max(res, (j - i) * height[j--]);
        }
        return res;
    }

    // 双指针
    public int maxAera2(int[] height) {
        int l = 0, r = height.length - 1;
        int ans = 0;
        while (l < r) {
            // 盛水量
            int area = Math.min(height[l], height[r]) * (r - l);
            ans = Math.max(ans, area);
            // 始终移动最小的一边
            if (height[l] <= height[r]) {
                ++l;
            } else {
                --r;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        problem011_盛最多水的容器 solution = new problem011_盛最多水的容器();
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int res = solution.maxAera(height);
        System.out.println(res);
        int res2 = solution.maxAera2(height);
        System.out.println(res2);
    }
}
