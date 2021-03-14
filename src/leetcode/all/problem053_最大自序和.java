package leetcode.all;

public class problem053_最大自序和 {
    //    方法1 动态规划
    public int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];//pre表示f(i-1)
        for (int num : nums) {
            pre = Math.max(num + pre, num);
            maxAns = Math.max(maxAns, pre);

        }
        return maxAns;
    }
}
