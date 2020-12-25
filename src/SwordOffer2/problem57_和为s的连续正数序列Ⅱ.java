package SwordOffer2;

import java.util.LinkedList;
import java.util.List;

public class problem57_和为s的连续正数序列Ⅱ {
    public int[][] findContinuousSequence(int target){
        int i=1;
        int j=1;
        int sum=0;
        List<int[]> res = new LinkedList<>();

        while (i<=target/2){
            if (sum<target){
                sum+=j;
                j++;
            }else if (sum>target){
                sum-=i;
                i++;
            }else {
                int[] arr=new int[j-i];
                for (int k = i; k <j ; k++) {
                    arr[k-i]=k;
                }
                res.add(arr);
                sum-=i;
                i++;
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
