class KthLargest {
    int[] numbers = new int[20001]; // the length cannot be too small: max(nums.length) + max(calls of add) + 1
    int size = 1;
    int kth;

    public KthLargest(int k, int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            numbers[size++] = nums[i];
        }
        kth = k;
    }
    
    public int add(int val) {
        numbers[size++] = val;
        Arrays.sort(numbers, 1, size);
        return numbers[size - kth];
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */