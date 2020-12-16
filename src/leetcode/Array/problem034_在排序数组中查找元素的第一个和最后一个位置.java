package leetcode.Array;

public class problem034_在排序数组中查找元素的第一个和最后一个位置 {
    public int[] searchRange(int[] nums, int target) {
        int leftInx = binarySearch(nums, target, true);
        int rightInx = binarySearch(nums, target, false) - 1;

        if (leftInx <= rightInx && rightInx <= nums.length && nums[leftInx] == target && nums[rightInx] == target) {
            return new int[]{leftInx, rightInx};
        }
        return new int[]{-1, -1};
    }

    public int binarySearch(int[] nums, int target, boolean lower) {
        int left = 0, right = nums.length - 1, ans = nums.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target || (lower && nums[mid] >= target)) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
