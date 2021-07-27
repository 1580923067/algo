package SwordOffer2;

public class problem11_旋转数组的最小数字 {
    public int minArray(int[] numbers){
        int low=0;
        int high=numbers.length-1;
        while (low<high){
            int pivot=low+(high-low)/2;
            //在左边
            if (numbers[pivot]<numbers[high]){
                high=pivot;
            //在右边
            }else if (numbers[pivot]>numbers[high]){
                low=pivot+1;
            }else {
                high-=1;
            }
        }
        return numbers[low];
    }
}
