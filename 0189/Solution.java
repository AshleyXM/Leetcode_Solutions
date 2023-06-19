class Solution {
    public void rotate(int[] nums, int k) {
        // Solution 1: Create a new array with the same size to store the result,
        // and then copy it into the original array one by one
        // int[] res = new int[nums.length];
        // for(int i = 0; i < nums.length; i++) {
        //     res[(i + k) % nums.length] = nums[i];
        // }
        // for(int i = 0; i < nums.length; i++) {
        //     nums[i] = res[i];
        // }

        // Solution 2: Create a new array to store the last k-elements
        k = k % nums.length; // because it is possible that k > nums.length
        int[] kele = new int[k]; // store the last k-elements into array kele
        for(int i = 0; i < k; i++) {
            kele[i] = nums[nums.length - (k - i)];
        }
        for(int i = nums.length - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }
        for(int i = 0; i < k; i++) {
            nums[i] = kele[i];
        }
    }
}