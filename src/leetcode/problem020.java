package leetcode;

import java.util.LinkedList;

/**
 * 4. 寻找两个正序数组的中位数
 */
public class problem020 {
    public boolean isValid(String s) {
        LinkedList<Character> stack = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (c == '[') stack.push(']');
            else if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (stack.isEmpty() || c != stack.pop()) return false;//如果stack初始为空 ||
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        problem020 problem004 = new problem020();
        System.out.println(problem004.isValid("((()))"));
    }
}
