package leetcode.all;

public class problem154_寻找旋转排序数组中的最小值Ⅱ {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int pivot = low + (high - low) / 2;
            if (nums[pivot] < nums[high]) {
                high = pivot;
            } else if (nums[pivot] > nums[high]) {
                low = pivot + 1;
            } else {
                high -= 1;
            }
        }
        return nums[low];
    }

    public static void main(String[] args) {
        problem154_寻找旋转排序数组中的最小值Ⅱ solution = new problem154_寻找旋转排序数组中的最小值Ⅱ();
        int[] nums = {2, 2, 2, 0, 1};
        System.out.println(solution.findMin(nums));
    }
}
