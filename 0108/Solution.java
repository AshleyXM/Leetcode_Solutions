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
    public TreeNode sortedArrayToBST(int[] nums) {
        int mid = (nums.length - 1) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = halfToBST(nums, 0, mid - 1);
        root.right = halfToBST(nums, mid + 1, nums.length - 1);
        return root;
    }

    public TreeNode halfToBST(int[] nums, int left, int right) {
        if(left > right) return null;
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = halfToBST(nums, left, mid - 1);
        root.right = halfToBST(nums, mid + 1, right);
        return root;
    }
}