package leetcode.all;

public class problem581_最短无序连续子数组 {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int maxn = Integer.MIN_VALUE, right = -1;
        int minn = Integer.MAX_VALUE, left = -1;
        for (int i = 0; i < n; i++) {
            if (maxn >= nums[i]) {
                right = i;
            } else {
                maxn = nums[i];
            }

            if (minn <= nums[n - i - 1]) {
                left = n - i - 1;
            } else {
                minn = nums[n - i - 1];
            }
        }
        return right == -1 ? 0 : right - left + 1;
    }

    public static void main(String[] args) {
        problem581_最短无序连续子数组 solution = new problem581_最短无序连续子数组();
        int[] nums = new int[]{2, 6, 4, 8, 10, 9, 15};
        int ans = solution.findUnsortedSubarray(nums);
        System.out.println(ans);

    }
}
