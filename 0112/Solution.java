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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root != null)
            return sum2Leaf(root, 0, targetSum);
        return false;
    }

    public boolean sum2Leaf(TreeNode node, int sum, int targetSum) {
        // Special case: [1, 2], targetSum = 1
        if(node.left == null && node.right == null) {
            return (sum + node.val == targetSum);
        } else if(node.left == null) { // node.right != null
            return sum2Leaf(node.right, sum + node.val, targetSum);
        } else if(node.right == null) { // node.left != null
            return sum2Leaf(node.left, sum + node.val, targetSum);
        } else { // node.left != null && node.right != null
            return sum2Leaf(node.left, sum + node.val, targetSum) || sum2Leaf(node.right, sum + node.val, targetSum);
        }
    }
}