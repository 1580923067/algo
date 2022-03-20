package leetcode.all;

public class problem191_为1的个数 {
    // 循环一位
    public int hammingWeight(int n) {
        int ret = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {
                ret++;
            }
        }
        return ret;
    }

    // 位运算
    public int hammingWeight1(int n) {
        int ret = 0;
        while (n != 0) {
            n &= n - 1;
            ret++;
        }
        return ret;
    }

    public static void main(String[] args) {
        problem191_为1的个数 solution = new problem191_为1的个数();
        int n = 00000000000000000000000000001011;
        int res = solution.hammingWeight(n);
        int res1 = solution.hammingWeight1(n);
        System.out.println(res);
        System.out.println(res1);
    }
}
