class NumArray {
    private int[] numArr = new int[10000];

    public NumArray(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            numArr[i] = nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        int sum = 0;
        for(int i = left; i <= right; i++)
            sum += numArr[i];
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */