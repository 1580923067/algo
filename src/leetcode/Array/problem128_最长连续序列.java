package leetcode.Array;

import java.util.HashSet;
import java.util.Set;

public class problem128_最长连续序列 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> num_set = new HashSet<Integer>();
        for (Integer num : nums) {
            num_set.add(num);
        }

        int longestStreak = 0;
        for (Integer num : num_set) {
            if (!num_set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (num_set.contains(num + 1)) {
                    currentNum += 1;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }
}
