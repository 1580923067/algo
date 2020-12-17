package SwordOffer2;

public class problem14_剪绳子Ⅰ {
//    1、当所有绳段长度相等时，乘积最大
//    2、最优的绳段长度为3
    public int cuttingRope(int n){
        if (n<=3) return n-1;
        int a=n/3,b=n%3;
        if (b==0) return (int) Math.pow(3,a);
        if (b==1) return (int) (Math.pow(3,a-1)*4);
        return (int) (Math.pow(3,a)*2);
    }
}
