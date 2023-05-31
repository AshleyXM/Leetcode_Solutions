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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> resList =  new ArrayList<>(); // store the result strings
        List<TreeNode> current_path = new ArrayList<>();
        current_path.add(root); // the number of nodes should be at least 1
        while(current_path.size() != 0) {
            int size = current_path.size();
            while(current_path.get(size - 1).left != null) {
                // add the left node of the current node to the current path
                current_path.add(current_path.get(size - 1).left);
                // update the size of current_path
                size = current_path.size();
                // set the left node of the previous node to null
                current_path.get(size - 2).left = null;
            }
            while(current_path.get(size - 1).right != null) {
                // add the left node of the current node to the current path
                current_path.add(current_path.get(size - 1).right);
                // update the size of current_path
                size = current_path.size();
                // set the left node of the previous node to null
                current_path.get(size - 2).right = null;
            }
            if(current_path.get(size - 1).left == null && current_path.get(size - 1).right == null) {
                // reach the leaf
                String res = "";
                for(int i = 0; i < size - 1; i++) { // join the current path
                    res = res + current_path.get(i).val + "->";
                }
                res += current_path.get(size - 1).val;
                resList.add(res);
                // remove the current leaf and parent node which completed traversing
                while(size >0 && current_path.get(size - 1).left == null && current_path.get(size - 1).right == null) {
                    current_path.remove(current_path.size() - 1);
                    // update the size of current_path
                    size = current_path.size();
                }
            }
        }
        return resList;
    }
}