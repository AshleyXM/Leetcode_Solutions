class Solution {
    private int[] nums;
    private Random rand = new Random();

    public Solution(int[] nums) {
        this.nums = nums;
    }
    
    public int[] reset() {
        return nums;
    }
    
    public int[] shuffle() {
        int[] num_copy = nums.clone();
        for(int i = 0; i < nums.length; i++) {
            // 生成一个索引值，范围为[i, nums.length - 1]
            int idx = i + rand.nextInt(nums.length - i);
            swap(num_copy, i, idx);
        }
        return num_copy;
    }

    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */