package leetcode.all;

public class problem059_螺旋矩阵Ⅱ {
    public int[][] generateMatrix(int n) {
        int l = 0, r = n - 1, t = 0, b = n - 1;
        int[][] mat = new int[n][n];
        int num = 1, tar = n * n;
        while (num <= tar) {
            for (int i = 1; i <= r; i++) {
                mat[t][i] = num++;
                t++;
            }
            for (int i = t; i <= b; i++) {
                mat[i][r] = num++;
                r--;
            }
            for (int i = r; i >= 1; i--) {
                mat[b][i] = num++;
                b--;
            }
            for (int i = b; i >= t; i--) {
                mat[i][l] = num++;
                l++;
            }
        }
        return mat;
    }
}
