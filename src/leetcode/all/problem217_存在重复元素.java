package leetcode.all;

import java.util.HashSet;
import java.util.Set;

public class problem217_存在重复元素 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        problem217_存在重复元素 solution = new problem217_存在重复元素();
        int[] nums = {1,2,3,1};
        System.out.println(solution.containsDuplicate(nums));
    }
}
