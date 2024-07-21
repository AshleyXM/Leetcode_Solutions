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
// Solution 1
/*class Solution {
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
}*/

// Solution 2: Space complexity: O(1)
class Solution {
    int maxCount = 0;
    int prevVal = Integer.MIN_VALUE;
    int curCount = 0;
    ArrayList<Integer> res = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        searchTree(root);
        int[] resArr = new int[res.size()];
        int pos = 0;
        for(Integer i: res) {
            resArr[pos++] = i;
        }
        return resArr;
    }

    public void searchTree(TreeNode cur) {
        if(cur == null) return;
        searchTree(cur.left);
        if(prevVal == Integer.MIN_VALUE) { // the first node
            curCount = 1;
        } else if(cur.val == prevVal) {
            curCount++;
        } else { // cur.val != prevVal
            curCount = 1;
        }
        prevVal = cur.val;
        if(curCount == maxCount) {
            res.add(prevVal);
        } else if(curCount > maxCount) {
            res.clear();
            res.trimToSize();
            res.add(prevVal);
            maxCount = curCount;
        }
        searchTree(cur.right);
    }
}