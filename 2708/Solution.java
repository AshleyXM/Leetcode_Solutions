class Solution {
    public long maxStrength(int[] nums) {
        Arrays.sort(nums);
        int pos = 0;
        int neg = 0;
        for(int i = 0; i < nums.length; i++) { // count the number of positives and negatives
            if(nums[i] > 0) pos++;
            else if(nums[i] < 0) neg++;
        }
        long max;
        if(pos == 0 && neg <= 1) // in this case, max = 0 or the maximum negative
            max = nums[nums.length - 1];
        else // there must be at lease one positive or two negatives
            max = 1;
        for(int i = 0; i < ((neg % 2 == 0) ? neg : neg - 1); i++) {
            max *= nums[i];
        }
        for(int i = nums.length - 1; i >= nums.length - pos; i--) {
            max *= nums[i];
        }
        return max;
    }
}