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
// Solution 1: recursion (general method, not only applicable to complete binary tree)
/*
 * Time Complexity: O(n)
*/
/*class Solution {
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}*/

/*
 * Time Complexity: O(log^2 n), which is less than O(n)
*/

class Solution {
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        TreeNode leftSubTree = root.left;
        TreeNode rightSubTree = root.right;
        int leftHeight = getHeight(leftSubTree);
        int rightHeight = getHeight(rightSubTree);
        if(leftHeight == rightHeight) { // left sub tree is complete
            return (int)Math.pow(2, leftHeight) + countNodes(root.right);
        } else { // leftHeight > rightHeight => left sub tree is not complete
            return (int)Math.pow(2, rightHeight) + countNodes(root.left);
        }
    }

    public int getHeight(TreeNode root) {
        if(root == null) return 0;
        return getHeight(root.left) + 1;
    }
}