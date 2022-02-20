package leetcode.all;

public class problem283_移动零 {
    public void moveZeroes(int[] nums){
        int n= nums.length, left = 0, right = 0;
        while (right < n){
            if (nums[right] > 0){
                swap(nums, left, right);
                left++;
            }
            right++;
        }
    }

    public void swap(int[] nums, int left, int right){
        int tmp = nums[left];
        nums[left] = nums[right];
        nums[right] = tmp;
    }
}
