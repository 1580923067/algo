package SwordOffer2;
//与 面试题10- I. 斐波那契数列 等价，唯一的不同在于起始数字不同。

public class problem10_青蛙跳台阶问题Ⅱ {
    public int numWays(int n) {
        int a = 1, b = 1, sum;
        for (int i = 0; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}
