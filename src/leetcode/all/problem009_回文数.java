package leetcode.all;

public class problem009_回文数 {
    // 反转一半的数字
    public boolean isPalindrom(int x) {
        // 负数不是，末尾数字是0且数字不为0也不是
        if (x < 0 || x % 10 == 0 && x != 0) {
            return false;
        }

        int revertNumber = 0;
        while (x > revertNumber) {
            revertNumber = revertNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertNumber || x == revertNumber / 10;
    }
}
