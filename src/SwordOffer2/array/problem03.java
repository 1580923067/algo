/**
 * 找出数组中重复的元素
 * 将数组中的元素按照顺序，依次放入Set集合，遇到重复的则放入失败，返回即可
 */
package SwordOffer2.array;

import java.util.HashSet;
import java.util.Set;

public class problem03 {
    public int findRepeatNumber(int[] nums){
        Set<Integer> set = new HashSet<>();
        int repeat=-1;
        for (int num : nums) {
            if (!set.add(num)){
                repeat=num;
                break;
            }
        }
        return repeat;
    }
}
