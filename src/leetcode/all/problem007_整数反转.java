package leetcode.all;

public class problem007_整数反转 {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            if (rev < Integer.MIN_VALUE / 10 || rev > Integer.MAX_VALUE / 10) {
                return 0;
            }
            int digit = x % 10;
            x /= 10;
            rev = rev * 10 + digit;
        }
        return rev;
    }

    public static void main(String[] args) {
        problem007_整数反转 solution = new problem007_整数反转();
        int res = solution.reverse(123);
        System.out.println(res);
    }
}
