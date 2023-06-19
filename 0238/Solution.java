class Solution {
    public int[] productExceptSelf(int[] nums) {
        long product = 1;
        int count = 0; // the number of zeroes
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                product *= nums[i];
            } else {
                count++;
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                if(count > 0)
                    nums[i] = 0;
                else
                    nums[i] = (int)(product / nums[i]);
            } else {
                if(count > 1) // more than one zeroes
                    nums[i] = 0;
                else // only the current element is zero
                    nums[i] = (int)product;
            }
        }
        return nums;
    }
}