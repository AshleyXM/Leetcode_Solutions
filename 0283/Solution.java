class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> indices = new ArrayList<>(); // store the indices of zeroes
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0)
                indices.add(i);
            else {
                if(indices.size() > 0) {
                    nums[indices.get(0)] = nums[i];
                    indices.remove(0);
                    nums[i] = 0;
                    indices.add(i);
                }
            }
        }
    }
}