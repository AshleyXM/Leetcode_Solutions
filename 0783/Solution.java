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
    private int[] numbers = new int[100];
    int size = 0; // the number of nodes

    public void TraverseInOrder(TreeNode node) {
        if(node != null) {
            TraverseInOrder(node.left);
            numbers[size++] = node.val;
            TraverseInOrder(node.right);
        }
    }

    public int minDiffInBST(TreeNode root) {
        TraverseInOrder(root);
        int diff = numbers[1] - numbers[0];
        for(int i = 1; i < size; i++) {
            if(numbers[i] - numbers[i - 1] < diff) {
                diff = numbers[i] - numbers[i - 1];
            }
            if(diff == 0)
                return diff;
        }
        return diff;
    }
}