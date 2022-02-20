package leetcode.all;

import java.util.Deque;
import java.util.LinkedList;

public class problem739_每日温度 {
    public int[] dailyTemperatures(int[] temperatures){
        int length = temperatures.length;
        int[] ans = new int[length];
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            int temperature = temperatures[i];
            while (!stack.isEmpty() && temperature > temperatures[stack.peek()])
            {
                int preIndex = stack.pop();
                ans[preIndex] = i - preIndex;
            }
            stack.push(i);
        }

        return ans;
    }
}
