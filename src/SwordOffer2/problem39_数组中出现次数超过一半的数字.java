package SwordOffer2;

public class problem39_数组中出现次数超过一半的数字 {
    /**
     * 1、哈希表统计法，遍历数组nums，用hashmap统计各个数字的数量，时间和空间复杂度都为O(N)
     * 2、数组排序法，将数组排序，数组的中间元素即为众数
     * 3、摩尔投票法
     */
    public int majorityElement(int[] nums) {
        int x = 0, vote = 0, count = 0;
        for (int num : nums) {
            if (vote == 0) x = num;
            vote += num == x ? 1 : -1;
        }
        //验证x是否为众数
        for (int num : nums) {
            if (num == x) count++;
        }
        return count > nums.length / 2 ? x : 0;
    }
}
