package SwordOffer2;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;

public class problem50_第一个只出现一次的字符 {
    public char firstUniqChar(String s){
        HashMap<Character, Boolean> dic = new HashMap<>();
        char[] sc=s.toCharArray();
        for (char c : sc) {
            dic.put(c,!dic.containsKey(c));
        }
        for (char c : sc) {
            if (dic.get(c)) return c;
        }
        return ' ';
    }
}
