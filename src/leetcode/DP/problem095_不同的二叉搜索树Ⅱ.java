package leetcode.DP;

import leetcode.Structure.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class problem095_不同的二叉搜索树Ⅱ {
    public List<TreeNode> generateTrees(int n){
        if (n==0){
            return new LinkedList<TreeNode>();
        }
        return generateTrees(1,n);
    }

    public List<TreeNode> generateTrees(int start, int end) {
        List<TreeNode> allTrees=new LinkedList<TreeNode>();
        if (start>end){
            allTrees.add(null);
            return allTrees;
        }

        for (int i = start; i <=end ; i++) {
            List<TreeNode> leftTrees=generateTrees(start,i-1);
            List<TreeNode> rightTrsss=generateTrees(i+1,end);

            for (TreeNode left : leftTrees) {
                for (TreeNode right : rightTrsss) {
                    TreeNode currTree=new TreeNode(i);
                    currTree.left=left;
                    currTree.right=right;
                    allTrees.add(currTree);
                }
            }
        }
        return allTrees;
    }
}
