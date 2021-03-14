package leetcode.all;

public class problem031_下一个排列 {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        //从后往前，找到第一个非降序a[i]
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            //从后往前遍历，找到第一个比a[i]大的数a[j]
            while (j >= 0 && nums[i] >= nums[j]) {
                j--;
            }
            //交换a[i]和a[j]
            swap(nums, i, j);
        }
        //将a[j]后的数，按照升序排列
        reverse(nums, i + 1);
    }

    public void reverse(int[] nums, int start) {
        int left = start, right = nums.length - 1;
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
