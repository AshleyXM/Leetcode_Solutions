class Solution {
    public int arrayPairSum(int[] nums) {
        // Idea: Pair small numbers as much as possible
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i += 2)
            sum += nums[i];
        return sum;
    }
}