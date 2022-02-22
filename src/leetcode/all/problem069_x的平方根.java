package leetcode.all;

public class problem069_x的平方根 {
    // 二分法
    public int mySqrt(int x) {
        int l = 0, r = x, ans = -1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
}
