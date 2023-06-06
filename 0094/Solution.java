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
    List<Integer> res = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null)
            return res;
        inorder(root);
        return res;
    }

    public void inorder(TreeNode node) {
        if(node.left != null && node.right != null) {
            inorder(node.left);
            res.add(node.val);
            inorder(node.right);
        } else if(node.left != null) { // no right node
            inorder(node.left);
            res.add(node.val);
        } else if(node.right != null) { // no left node
            res.add(node.val);
            inorder(node.right);
        } else {
            res.add(node.val);
        }
    }
}