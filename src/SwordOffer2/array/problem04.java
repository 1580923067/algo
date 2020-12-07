/**
 * 查找二维数组中的元素，数组按照从左到右，从上到下已经排好顺序
 * 1、从数组的右上角开始，如果等于目标值则返回；如果大于目标值，则向左移动一列；
 * 如果小于目标值，则向下移动一行；
 */
package SwordOffer2.array;

public class problem04 {
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

}
