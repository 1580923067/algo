package leetcode.all;

import java.util.HashMap;
import java.util.Map;

public class problem001_两数之和 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                // 如果找到目标值，则返回hashtable中的索引
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            // 将数组的元素放入hashtable中
            hashtable.put(nums[i], i);
        }
        // 如果没有对应的结果，则返回空数组
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target = 30;
        int[] result = twoSum(nums, target);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
