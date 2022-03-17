package leetcode.all;

public class problem674_最长连续递增序列 {
    public int findLengthOfCIS(int[] nums) {
        int ans = 0;
        int n = nums.length;
        int statr = 0;
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] <= nums[i - 1]) {
                statr = i;
            }
            ans = Math.max(ans, i - statr + 1);
        }
        return ans;
    }
}
