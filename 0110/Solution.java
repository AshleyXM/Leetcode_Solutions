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
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        List<TreeNode> pendList = new ArrayList<>();
        pendList.add(root);
        int size = pendList.size();
        while(size != 0) {
            TreeNode curNode = pendList.get(size - 1);
            if(curNode.left != null && curNode.right != null) { // has both left and right nodes
                int hdiff = getHeight(curNode.left) - getHeight(curNode.right);
                if(Math.abs(hdiff) > 1)
                    return false;
                pendList.add(curNode.left);
                pendList.add(curNode.right);
                pendList.remove(size - 1);
                size++;
            } else if(curNode.left != null) { // no right child
                if(getHeight(curNode.left) > 1)
                    return false;
                pendList.add(curNode.left);
                pendList.remove(size - 1);
            } else if(curNode.right != null) { // no left child
                if(getHeight(curNode.right) > 1)
                    return false;
                pendList.add(curNode.right);
                pendList.remove(size - 1);
            } else { // no children
                pendList.remove(size - 1);
                size--;
            }
        }
        return true;
    }

    public int getHeight(TreeNode node) {
        if(node.left == null && node.right == null)
            return 1;
        else if(node.right == null) // no right child
            return getHeight(node.left) + 1;
        else if(node.left == null) // no left child
            return getHeight(node.right) + 1;
        else
            return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
    }
}