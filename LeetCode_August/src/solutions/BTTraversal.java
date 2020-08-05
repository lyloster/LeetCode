package solutions;

import java.util.LinkedList;
import java.util.Queue;

public class BTTraversal {
    static class TreeNode { //doesn't compile if not static
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

    static class Solution {
//        public List<Double> averageOfLevels(TreeNode root) {
//
//        }

        public void preOrder(TreeNode root){
            if (root == null) {
                return;
            }
            System.out.println(root.val);
            inOrder(root.left);
            inOrder(root.right);
        }
        public void inOrder(TreeNode root){
            if (root == null) {
                return;
            }
            inOrder(root.left);
            System.out.println(root.val);
            inOrder(root.right);
        }
        public void postOrder(TreeNode root){
            if (root == null) {
                return;
            }
            inOrder(root.left);
            inOrder(root.right);
            System.out.println(root.val);
        }

        public void levelOrder(TreeNode root) {
            if (root != null) {
                Queue<TreeNode> q = new LinkedList<>();
                q.add(root);
                while (!q.isEmpty()) {
                    TreeNode tempNode = q.poll();
                    System.out.println(tempNode.val);
                    if (tempNode.left != null) {
                        q.add(tempNode.left);
                    }

                    if (tempNode.right != null) {
                        q.add(tempNode.right);
                    }
                }
            }
        }
    }

    public static void main(String[] args){
        //create a tree object
        //add some node
        TreeNode lright2 = new TreeNode(15, null, null);
        TreeNode rright2 = new TreeNode(7, null, null);
        TreeNode left1 = new TreeNode(9, null, null);
        TreeNode right1 = new TreeNode(20,lright2, rright2);
        TreeNode root = new TreeNode(3, left1, right1);
        System.out.println("tree created");
        //create a solution object
        //use traversals
        Solution sl = new Solution();
        System.out.println("pre-order");
        sl.preOrder(root);
        System.out.println("in-order");
        sl.inOrder(root);
        System.out.println("post-order");
        sl.postOrder(root);
        System.out.println("level-order");
        sl.levelOrder(root);
        System.out.println("done");
    }
}
