package SwordOffer2;

public class problem16_数值的整数次方 {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }

        if (n < 0)
            return 1 / x * myPow(1 / x, -(n - 1));
        return (n % 2 == 0) ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
    }
}
