package leetcode;

import java.util.Arrays;

public class problem085 {
    class Solution {
        public int maximalRectangle(char[][] matrix) {
            if (matrix.length == 0) return 0;
            int m = matrix.length;
            int n = matrix[0].length;

            int[] left = new int[n];
            int[] right = new int[n];
            int[] height = new int[n];

            Arrays.fill(right, n);
            int matrixaera = 0;

            for (int i = 0; i < m; i++) {
                int cur_left = 0, cur_right = n;
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] == '1') height[j]++;
                    else height[j] = 0;
                }

                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] == '1')
                        left[j] = Math.max(cur_left, left[j]);
                    else {
                        left[j] = 0;
                        cur_left = j + 1;
                    }
                }

                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] == '1')
                        right[j] = Math.min(cur_right, right[j]);
                    else {
                        right[j] = n;
                        cur_right = j;
                    }
                }

                for (int j = 0; j < n; j++) {
                    matrixaera = Math.max((right[j] - left[j]) * height[j], matrixaera);
                }
            }
            return matrixaera;
        }
    }

    
}
