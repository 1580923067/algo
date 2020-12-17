package SwordOffer2;

//f(n+1)=f(n)+f(n−1)
// dp[0]=0, dp[1] = 1dp[1]=1

public class problem10_斐波那契数列Ⅰ {
    public int fib(int n) {
        int a = 0, b = 1, sum;
        for (int i = 0; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}
