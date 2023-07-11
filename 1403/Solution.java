class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums);
        int left = 0;
        for(int i = 0; i < nums.length; i++)
            left += nums[i];
        int pointer = nums.length - 1;
        int right = 0;
        // pick the largest number preferentially so that we can get a larger sum with less size
        while(pointer >= 0) {
            right += nums[pointer];
            left -= nums[pointer];
            res.add(nums[pointer]);
            if(left < right)
                return res;
            pointer--;
        }
        return res;
    }
}