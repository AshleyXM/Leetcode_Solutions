// sliding window
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0, end = 0;
        int sum = 0;
        int minCount = Integer.MAX_VALUE;
        int curCount = 0;
        while(start < nums.length) {
            while(sum < target && end < nums.length) {
                sum += nums[end++];
                curCount++;
            }
            if(end == nums.length && sum < target) break;
            if(curCount < minCount) minCount = curCount;
            sum -= nums[start++];
            curCount--;
        }
        if(minCount == Integer.MAX_VALUE) return 0;
        return minCount;
    }
}