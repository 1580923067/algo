package SwordOffer2;

import leetcode.Structure.TreeNode;

import java.util.Arrays;
import java.util.HashMap;

public class problem07_重建二叉树 {
    int[] preorder;
    HashMap<Integer, Integer> dic = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        for (int i = 0; i < inorder.length; i++) {
            dic.put(inorder[i], i);
        }
        return recur(0, 0, inorder.length - 1);
    }

    TreeNode recur(int root, int left, int right) {
        if (left > right) return null;
        TreeNode node = new TreeNode(preorder[root]);
        int i = dic.get(preorder[root]);
        node.left = recur(root + 1, left, i - 1);
        node.right = recur(root + i - left + 1, i + 1, right);
        return node;
    }


    public TreeNode buildTree2(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }
        // 前序的第一个元素是根节点
        TreeNode root = new TreeNode(preorder[0]);
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == preorder[0]) {
                root.left = buildTree2(Arrays.copyOfRange(preorder, 1, i + 1),
                    Arrays.copyOfRange(inorder, 0, i));
                root.right = buildTree2(Arrays.copyOfRange(preorder, i + 1, preorder.length),
                    Arrays.copyOfRange(inorder, i + 1, inorder.length));
            }
            break;
        }
        return root;
    }
}
