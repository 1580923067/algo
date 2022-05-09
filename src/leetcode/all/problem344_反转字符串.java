package leetcode.all;

public class problem344_反转字符串 {
    public void reverseString(char[] s) {
        int n = s.length;
        for (int left = 0, right = n - 1; left < right; ++left, --right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
        }
    }

    public static void main(String[] args) {
        problem344_反转字符串 solution = new problem344_反转字符串();

    }
}
