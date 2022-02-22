package leetcode.all;

public class problem287_寻找重复数 {
    // 快慢指针
    public int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

    public static void main(String[] args) {
        problem287_寻找重复数 solution = new problem287_寻找重复数();
        int[] nums = new int[]{1, 4, 6, 6, 6, 2, 3};
        int ans = solution.findDuplicate(nums);
        System.out.println(ans);
    }
}
