package SwordOffer2;

public class problem15_二进制中1的个数 {
    //    方法1 逐位与
    public int hammingweight(int n) {
        int res = 0;
        while (n != 0) {
            res += n & 1;
            n >>>= 1;
        }
        return res;
    }

    //    方法2 n&(n-1)
    public int hammingweight2(int n) {
        int res = 0;
        while (n != 0) {
            res++;
            n &= (n - 1);

        }
        return res;
    }
}
