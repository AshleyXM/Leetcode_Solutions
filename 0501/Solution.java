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
    public Map<Integer, Integer> hashmap = new HashMap<>();

    public int[] findMode(TreeNode root) {
        countBST(root);

        int maxCount = 0;
        List<Integer> modeList = new ArrayList<>();
        for(Integer key: hashmap.keySet()) {
            int curCount = hashmap.get(key);
            if(curCount > maxCount) {
                modeList = new ArrayList<>(Arrays.asList(key));
                maxCount = curCount; // update the current max count
            } else if(curCount == maxCount) {
                modeList.add(key);
            }
        }
        int[] res =  new int[modeList.size()];
        int pos = 0;
        for(Integer ele: modeList) {
            res[pos++] = ele;
        }
        return res;
    }

    public void countBST(TreeNode current) {
        if(current != null) {
            hashmap.put(current.val, hashmap.getOrDefault(current.val, 0) + 1);
            countBST(current.left);
            countBST(current.right);
        }
    }
}