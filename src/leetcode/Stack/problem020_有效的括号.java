package leetcode.Stack;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class problem020_有效的括号 {
    public boolean isValid(String s) {
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }

        Map<Character, Character> pairs = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};

        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            // 遍历字符串，如果遇到右括号
            if (pairs.containsKey(ch)) {
                // 如果栈为空或者栈顶元素不是左括号，则返回false
                if (stack.isEmpty() || stack.peek() != pairs.get(ch)) {
                    return false;
                }
                // 否则弹出栈顶元素
                stack.pop();
                // 如果不是右括号，即遍历到左括号，则压入栈
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }

    public boolean isValid1(String s) {
        if (s == null) {
            return false;
        }
        while (true) {
            int l = s.length();
            s = s.replace("()", "");
            s = s.replace("[]", "");
            s = s.replace("{}", "");
            if (s.length() == l){
                return l == 0;
            }
        }
    }

    public static void main(String[] args) {
        problem020_有效的括号 solution = new problem020_有效的括号();
        String s = "([])";
        boolean res = solution.isValid1(s);
        System.out.println(res);
    }
}
