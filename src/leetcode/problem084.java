package leetcode;

public class problem084 {
    class Solution {
        //暴力
        public int largestRectangleArea(int[] heights) {
            int len = heights.length;
            if (len == 0) {
                return 0;
            }

            int res = 0;
            for (int i = 0; i < len; i++) {
                //找到左边最后一个大于或等于curHeight的下标
                int left = i;
                int curHeight = heights[i];
                while (left > 0 && heights[left - 1] >= curHeight) {
                    left--;
                }

                //找到右边最后一个大于或等于curHeight的下标
                int right = i;
                while (right < len-1 && heights[right + 1] >= curHeight) {
                    right++;
                }
                int width = right - left + 1;
                res = Math.max(width * curHeight, res);
            }
            return res;
        }
    }
}
