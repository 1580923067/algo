package SwordOffer2;

import java.util.Stack;

public class problem31_栈的压入弹出序列 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for (int num : pushed) {
            stack.push(num);
            while (!stack.isEmpty() && popped[i] == stack.peek()) {
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty();
    }
}
