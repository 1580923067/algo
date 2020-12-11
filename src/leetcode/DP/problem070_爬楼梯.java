package leetcode.DP;

public class problem070_爬楼梯 {
    //f(x)=f(x-1)+f(x-2)
    public int climbStairs(int n){
        int p=0,q=0,r=1;
        for (int i = 1; i <=n ; i++) {
            p=q;
            q=r;
            r=p+q;
        }
        return r;
    }
}
