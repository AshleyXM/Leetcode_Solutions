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
    public TreeNode invertTree(TreeNode root) {
        // Solution 1: Solve the problem recursively
        if(root == null)
            return null;
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = invertTree(right);
        root.right = invertTree(left);
        return root;

        // Solution 2: Use while loop to solve
        // List<TreeNode> pendList = new ArrayList<TreeNode>();
        // if(root == null)
        //     return null;
        // pendList.add(root);
        // int size = pendList.size(); // the size of pendList
        // while(size != 0) {
        //     if(pendList.get(size - 1).left != null && pendList.get(size - 1).right != null) {
        //         // add the two new nodes into pendList
        //         pendList.add(pendList.get(size - 1).left);
        //         pendList.add(pendList.get(size - 1).right);
        //         // invert the left node and the right node
        //         TreeNode tmp = pendList.get(size - 1).left;
        //         pendList.get(size - 1).left = pendList.get(size - 1).right;
        //         pendList.get(size - 1).right = tmp;
        //     } else if(pendList.get(size - 1).left != null) { // no right node
        //         // add the left node into pendList
        //         pendList.add(pendList.get(size - 1).left);
        //         // invert the left node and the right node
        //         pendList.get(size - 1).right = pendList.get(size - 1).left;
        //         pendList.get(size - 1).left = null;
        //     } else if(pendList.get(size - 1).right != null) { // no left node
        //         // add the right node into pendList
        //         pendList.add(pendList.get(size - 1).right);
        //         // invert the left node and the right node
        //         pendList.get(size - 1).left = pendList.get(size - 1).right;
        //         pendList.get(size - 1).right = null;
        //     }
        //     // remove the current root node from the pendList
        //     pendList.remove(size - 1);
        //     // update the size of pendList
        //     size = pendList.size();
        // }
        // return root;
    }
}