class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> hashset = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0)
                hashset.add(nums[i]);
        }
        return hashset.size();
    }
}