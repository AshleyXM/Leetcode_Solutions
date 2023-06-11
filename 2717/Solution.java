class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int min = -1; // the index of the minumum value
        int max = -1; // the index of the maximum value
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1)
                min = i;
            else if(nums[i] == nums.length)
                max = i;
            // in this way, the number of loops can be reduced
            if(min != -1 && max != -1) { // both min and max have been set
                if(min < max)
                    return min + (nums.length - 1 - max);
                else
                    return min + (nums.length - 1 - max) - 1; // the swap operation of the minimum value can do help to the swap operation of the maximum value by reducing one time
            }
        }
        return 0;
    }
}