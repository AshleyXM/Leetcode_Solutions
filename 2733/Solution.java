class Solution {
    public int findNonMinOrMax(int[] nums) {
        // Solution 1: find the min and max first, and then use another loop to get one number bwtween min and max
        // int min = nums[0];
        // int max = nums[0];
        // for(int i = 1; i < nums.length; i++) {
        //     if(nums[i] > max) {
        //         max = nums[i];
        //     } else if(nums[i] < min) {
        //         min = nums[i];
        //     }
        // }
        // for(int i = 0; i < nums.length; i++)
        //     if(nums[i] != max && nums[i] != min)
        //         return nums[i];
        // return -1;

        // Solution 2: return the number with a faster within a shorter time
        int min = nums[0];
        int max = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > max) { // find a bigger number
                if(max != min) // the original max is not equal to min
                    return max;
                max = nums[i];
            }
            if(nums[i] < min) { // find a smaller number
                if(max != min) // the original min is not equal to max
                    return min;
                min = nums[i];
            }
            if(nums[i] > min && nums[i] < max) // find a number which is between the current min and max
                return nums[i];
        }
        return -1;
    }
}