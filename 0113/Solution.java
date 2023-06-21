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
    private static List<Integer> current;
    private static List<List<Integer>> res;

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        res = new ArrayList<>();
        if(root != null)
            sum2Leaf(root, "", targetSum);    
        return res;
    }

    public void sum2Leaf(TreeNode node, String path, int targetSum) {
        if(node.left == null && node.right == null) { // leaf node
            if(targetSum == node.val) {
                String[] numbers = path.split(",");
                current = new ArrayList<>(); // current must be initialized here rather than in function pathSum
                for(int i = 1; i < numbers.length; i++) {
                    current.add(Integer.parseInt(numbers[i]));
                }
                current.add(node.val); // add the last node into current
                res.add(current);
            }

        } else if(node.left == null) { // node.right != null
            sum2Leaf(node.right, path + "," + node.val, targetSum - node.val);
        } else if(node.right == null) { // node.left != null
            sum2Leaf(node.left, path + "," + node.val, targetSum - node.val);
        } else { // node.left != null && node.right != null
            sum2Leaf(node.left, path + "," + node.val, targetSum - node.val);
            sum2Leaf(node.right, path + "," + node.val, targetSum - node.val);
        }
    }
}