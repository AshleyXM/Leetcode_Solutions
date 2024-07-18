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
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;
        if(root != null) {
            int curVal = root.val;
            if(curVal >= low && curVal <= high) {
                sum += curVal;
            }
            sum += rangeSumBST(root.left, low, high);  // traverse the left sub-tree
            sum += rangeSumBST(root.right, low, high);  // traverse the right sub-tree
        }
        return sum;
    }
}