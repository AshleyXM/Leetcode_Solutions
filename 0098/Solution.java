/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    // // Solution 1: Solve it with recursive method
    // public boolean isValidBST(TreeNode root) {
    //     if(root == null)
    //         return true;
    //     return isValid(root.left, (long)Integer.MIN_VALUE - 1, root.val) && isValid(root.right, root.val, (long)Integer.MAX_VALUE + 1);
    // }

    // // As node.val can be Integer.MIN_VALUE or Integer.MAX_VALUE, so min and max must be of type long
    // public boolean isValid(TreeNode node, long min, long max) {
    //     if(node == null)
    //         return true;
    //     if(node.val > min && node.val < max)
    //         return isValid(node.left, min, node.val) && isValid(node.right, node.val, max);
    //     return false;
    // }

    // Solution 2: Solve it with inorder traversal
    private int[] res = new int[10000]; // the maximum number of nodes is 10^4
    private int size = 0;
    public boolean isValidBST(TreeNode root) {
        inOrder(root);
        for(int i = 1; i < size; i++)
            if(res[i] <= res[i - 1])
                return false;
        return true;
    }

    public void inOrder(TreeNode node) {
        if(node == null) return;
        inOrder(node.left);
        res[size++] = node.val;
        inOrder(node.right);
    }
}