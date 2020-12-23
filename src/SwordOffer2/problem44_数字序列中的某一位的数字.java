package SwordOffer2;

public class problem44_数字序列中的某一位的数字 {
    public int findNthDigit(int n) {
        int didit = 1;
        long start = 1;
        long count = 9;
        while (n > count) {
            n -= count;
            didit += 1;
            start *= 10;
            count = didit * start * 9;
        }
        long num = start + (n - 1) / didit;
        return Long.toString(num).charAt((n - 1) % didit) - '0';
    }
}
