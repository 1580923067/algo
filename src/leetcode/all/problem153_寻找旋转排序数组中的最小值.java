package leetcode.all;

public class problem153_寻找旋转排序数组中的最小值 {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int pivot = low + (high - low) / 2;
            if (nums[pivot] < nums[high]) {
                high = pivot;
            } else {
                low = pivot + 1;
            }
        }
        return nums[low];
    }

    public static void main(String[] args) {
        problem153_寻找旋转排序数组中的最小值 solution = new problem153_寻找旋转排序数组中的最小值();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(solution.findMin(nums));
    }
}
