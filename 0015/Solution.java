class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        if(nums[0] > 0 || nums[nums.length - 1] < 0) // all the elements are positives or negatives
            return new ArrayList<>(res);        
        for(int i = 0; i < nums.length - 2; i++) {
            int target = - nums[i];
            int ph = i + 1;
            int pt = nums.length - 1;
            while(ph < pt) {
                if(nums[ph] + nums[pt] > target) {
                    pt--;
                } else if(nums[ph] + nums[pt] < target) {
                    ph++;
                } else { // nums[ph] + nums[pt] == target
                    // List<Integer> tmp = new ArrayList<>();
                    // tmp.add(nums[i]);
                    // tmp.add(nums[ph++]);
                    // tmp.add(nums[pt--]);
                    // res.add(tmp);

                    // This statement is much easier than the above code lines, but costs more time
                    res.add(Arrays.asList(nums[i], nums[ph++], nums[pt--]));
                }
            }
        }
        return new ArrayList<>(res);
    }
}