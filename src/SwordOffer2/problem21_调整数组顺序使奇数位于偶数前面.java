package SwordOffer2;

public class problem21_调整数组顺序使奇数位于偶数前面 {
    //两端指针，会打乱原有顺序
    public int[] exchange(int[] nums) {
        int i = 0, j = nums.length - 1, tmp;
        while (i < j) {
            // 奇数
            while (i < j && (nums[i] & 1) == 1) i++;
            // 偶数
            while (i < j && (nums[j] & 1) == 0) j--;
            // 交换奇数偶数
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        return nums;
    }

    // 保持数据的相对位置不变
    public int[] reOrderArray (int[] array) {
        // write code here
        if(array==null||array.length==0) return array;
        for(int i=1;i<array.length;i++){
            for(int j=i;j>=1;j--){
                if(array[j]%2==1&&array[j-1]%2==0){
                    swap(array,j,j-1);
                }
            }
        }
        return array;
    }

    public void swap(int[] arr,int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
}
