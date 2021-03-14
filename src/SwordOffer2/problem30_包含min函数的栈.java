package SwordOffer2;

import java.util.Stack;

public class problem30_包含min函数的栈 {

        Stack<Integer> A, B;

        public void MinStack() {
            A = new Stack<>();
            B = new Stack<>();
        }

        public void push(int x) {
            A.add(x);
            if (B.empty() || B.peek() >= x)
                B.add(x);
        }

        public void pop() {
            if (A.pop().equals(B.peek()))
                B.pop();
        }

        public int top() {
            return A.peek();
        }

        public int min() {
            return B.peek();
        }
    }
