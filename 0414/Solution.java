class Solution {
    public int thirdMax(int[] nums) {
        // sort the nums: from large to small
        for(int i = 0; i < nums.length - 1;i++) {
            int max = nums[i];
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[j] > max) { // swap the two elements
                    max = nums[j];
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
        // set the maximum number
        int max = nums[0];
        int p = 1;
        // get the third distinct maximum number if existing
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i - 1])
                p++;
            if(p == 3)
                return nums[i]; 
        }
        return max;
    }
}