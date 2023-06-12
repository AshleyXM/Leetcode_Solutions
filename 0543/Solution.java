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
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        List<TreeNode> nodes = new ArrayList<>();
        nodes.add(root);
        int max = 0;
        while(nodes.size() != 0) {
            TreeNode cur_node = nodes.get(nodes.size() - 1);
            if(getDiameter(cur_node) > max) // update max
                max = getDiameter(cur_node);
            nodes.remove(nodes.size() - 1);
            if(cur_node.left != null)
                nodes.add(cur_node.left);
            if(cur_node.right != null)
                nodes.add(cur_node.right);
        }
        return max;
    }

    // get the diameter of the current node
    public int getDiameter(TreeNode node) {
        if(node == null)
            return 0;
        return getHeight(node.left) + getHeight(node.right);
    }

    // get the height of the given node
    public int getHeight(TreeNode node) {
        if(node == null)
            return 0;
        return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
    }
}