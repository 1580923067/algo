package SwordOffer2;

import java.util.HashMap;
import java.util.Map;

public class problem48_最长不含重复字符的子字符串 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> dic = new HashMap<>();
        int res = 0, i = -1;
        for (int j = 0; j < s.length(); j++) {
            if (dic.containsKey(s.charAt(j)))
                i = Math.max(i, dic.get(s.charAt(j)));
            dic.put(s.charAt(j), j);
            res = Math.max(res, j - i);
        }
        return res;
    }

}
