package leetcode.all;

// 二叉搜索树（Binary Search Tree） BST
// 所有左子树节点的值小于根节点的值；右子树节点的值大于根节点的值
public class problem096_不同的二叉搜索树 {
    public int numTrees(int n) {
        int[] G = new int[n + 1];
        G[0] = 1;
        G[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                G[i] += G[j - 1] * G[i - j];
            }
        }
        return G[n];
    }

    public static void main(String[] args) {
        problem096_不同的二叉搜索树 solution = new problem096_不同的二叉搜索树();
        int n = 3;
        int res = solution.numTrees(n);
        System.out.println(res);
    }
}
