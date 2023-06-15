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
// Solution 1: Use iterative method to solve the problem (without utilizing the features of BST)
// class Solution {
//     public int getMinimumDifference(TreeNode root) {
//         int[] numbers = new int[10000]; // store the values of all the nodes
//         int size = 0; // the number of nodes
//         List<TreeNode> list = new ArrayList<>();
//         list.add(root);
//         while(list.size() != 0) {
//             TreeNode cur_node = list.get(list.size() - 1);
//             numbers[size++] = cur_node.val;
//             list.remove(list.size() - 1); // remove the current node
//             // add all not null child nodes into list
//             if(cur_node.left != null)
//                 list.add(cur_node.left);
//             if(cur_node.right != null)
//                 list.add(cur_node.right);
//         }
//         Arrays.sort(numbers, 0, size); // sort the numbers from small to large
//         int diff = numbers[1] - numbers[0]; // initiate the diff
//         for(int i = 1; i < size; i++) {
//             int tmp = numbers[i] - numbers[i - 1];
//             if(tmp < diff) {
//                 diff = tmp;
//                 if(diff == 0) // once find the difference between two numbers is zero, then return it
//                     return diff;
//             }
//         }
//         return diff;
//     }
// }

// Solution 2: Use recrusive method (utilizing the features of BST)
// The features of BST:
// 1. It is a binary tree.
// 2. The left subtree of a node contains only nodes with keys less than the node’s key.
// 3. The right subtree of a node contains only nodes with keys greater than the node’s key.
// 4. The left and right subtree each must also be a binary search tree.
class Solution {
    private int[] numbers = new int[10000];
    int size = 0;

    public int getMinimumDifference(TreeNode root) {
        traverseInOrder(root);
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

    public void traverseInOrder(TreeNode node) {
        if(node != null) {
            traverseInOrder(node.left);
            numbers[size++] = node.val;
            traverseInOrder(node.right);
        }
    }
}