/**
 * 将空格替换为%20
 */
package SwordOffer2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class problem05_替换空格 {
    public String replaceSpace(String s) {
        if (s == null) {
            return null;
        }
        int length = s.length();
        char[] array = new char[length * 3];
        int size = 0;
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                array[size++] = '%';
                array[size++] = '2';
                array[size++] = '0';
            } else {
                array[size++] = c;
            }
        }
        String newStr = new String(array, 0, size);
        return newStr;

    }

    public String replaceSpace2(String s) {
        StringBuilder res = new StringBuilder();
        for (Character c : s.toCharArray()) {
            if (c == ' ') res.append("%20");
            else res.append(c);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        problem05_替换空格 solution = new problem05_替换空格();
        String s = "We are happy.";
        System.out.println(solution.replaceSpace(s));
    }
}
