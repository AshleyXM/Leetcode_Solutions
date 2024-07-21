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
// Solution 1
/*class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) { // root -> null
            return 0;
        }
        if(root.left == null && root.right == null) { // current -> leaf node
            return 1;
        }
        int minDepth = Integer.MAX_VALUE;
        if(root.left != null) {
            int lMinDepth = minDepth(root.left);
            if(lMinDepth < minDepth) {
                minDepth = lMinDepth + 1;
            }
        }
        if(root.right != null) {
            int rMinDepth = minDepth(root.right);
            if(rMinDepth < minDepth) {
                minDepth = rMinDepth + 1;
            }
        }
        return minDepth;
    }
}*/
// Solution 2
class Solution {
    public int minDepth(TreeNode root) {
        // root -> null
        if(root == null) return 0;
        // current -> leaf node
        if(root.left == null && root.right == null) return 1;
        if(root.left == null) return minDepth(root.right) + 1;
        if(root.right == null) return minDepth(root.left) + 1;
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}