class Solution {
    public boolean canJump(int[] nums) {
        // Solution 1: Find the maximum reachable distance for every element
        // int max = 0;
        // for(int i = 0; i < nums.length; i++) {
        //     if(i > max) // index i is unreachable
        //         return false;
        //     max = Math.max(max, i + nums[i]); // update max if a larger reachable distance is found
        //     if(max >= nums.length - 1) // once find that the last element is reachable, return true
        //         return true;
        // }
        // return false;

        // Solution 1 plus: Optimize solution 1 by changing the condition of the for loop a little bit
        int max = 0;
        for(int i = 0; i <= max; i++) {
            max = Math.max(max, i + nums[i]); // update max if a larger reachable distance is found
            if(max >= nums.length - 1) // once find that the last element is reachable, return true
                return true;
        }
        return false;
    }
}