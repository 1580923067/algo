/**
 * 查找二维数组中的元素，数组按照从左到右，从上到下已经排好顺序
 * 1、从数组的右上角开始，如果等于目标值则返回；如果大于目标值，则向左移动一列；
 * 如果小于目标值，则向下移动一行；
 */
package SwordOffer2;

import java.util.Arrays;

public class problem04_二维数组中的查找 {
    // 从左上角元素开始
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length, columns = matrix[0].length;
        int row = 0, column = columns - 1;
        while (row < rows && column >= 0) {
            int num = matrix[row][column];
            if (num == target) {
                return true;
            } else if (num > target) {
                column--;
            } else {
                row++;
            }
        }

        return false;
    }

    // 从左下角开始或者右上角开始
    public boolean findNumberIn2DArray1(int[][] matrix, int target) {
        int i = matrix.length - 1, j = 0;
        while (i >= 0 && j < matrix[0].length) {
            if (matrix[i][j] > target) i--;
            else if (matrix[i][j] < target) j++;
            else return true;
        }
        return false;
    }

    public static void main(String[] args) {
        problem04_二维数组中的查找 solution = new problem04_二维数组中的查找();
        int[][] matrix = new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(matrix.length);
        int target = 5;
        boolean ans = solution.findNumberIn2DArray1(matrix, target);
        System.out.println(ans);
    }

}
