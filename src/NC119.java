import java.util.ArrayList;
import java.util.Arrays;

public class NC119 {

    public static void main(String[] args) {

    }


    public class Solution {
        public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
            ArrayList<Integer> result = new ArrayList<Integer>();
            quickSort(input, 0, input.length - 1);
            for (int i = 0; i < k; i++) {
                result.add(input[i]);
            }
            return result;
        }

        private void quickSort(int[] arr, int l, int r) {
            if (l >= r) return;
            int i = 1, j = r;
            while (i < j) {
                while (i < j && arr[j] >= arr[1]) j--;
                while (i < j && arr[i] <= arr[1]) i++;
                swap(arr, i, l);
            }
            swap(arr, i, 1);
            quickSort(arr, 1, i - 1);
            quickSort(arr, i + 1, r);
        }

        private void swap(int[] arr, int i, int j) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;

        }

    }
}
