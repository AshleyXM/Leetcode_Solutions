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
    public int maxLevelSum(TreeNode root) {
        List<TreeNode> nodes = new ArrayList<>(); // store all the nodes at the same level
        nodes.add(root);
        int max = Integer.MIN_VALUE;
        int cur_level = 0; // record the current level
        int res_level = cur_level;
        while(nodes.size() != 0) {
            cur_level++;
            int sum = 0;
            int current_size = nodes.size();
            for(int i = 0; i < current_size; i++) {
                sum += nodes.get(0).val; // sum up all the values of the nodes at the current level
                if(nodes.get(0).left != null)
                    nodes.add(nodes.get(0).left);
                if(nodes.get(0).right != null)
                    nodes.add(nodes.get(0).right);
                nodes.remove(0);
            }
            if(sum > max) {
                max = sum;
                res_level = cur_level;
            }
        }
        return res_level;
    }
}