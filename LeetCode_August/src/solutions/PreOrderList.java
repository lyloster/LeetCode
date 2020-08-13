package solutions;

import java.util.ArrayList;
import java.util.List;
/**
 * Given a binary tree, return the preorder traversal of its nodes' values.
 *
 * Example:
 *
 * Input: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 *
 * Output: [1,2,3]
 * Follow up: Recursive solution is trivial, could you do it iteratively?
 * */
public class PreOrderList {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> values = new ArrayList<>();

        if (root == null) {
            return values;
        }

        values.add(root.val);
        values.addAll(preorderTraversal(root.left));
        values.addAll(preorderTraversal(root.right));
        return values;
    }
}
