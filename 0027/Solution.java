class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> indices = new ArrayList<>(); // store the indices whose value is equal to val
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == val) {
                indices.add(i);
                count++;
            } else { // nums[i] != val
                if(indices.size() != 0) {
                    nums[indices.get(0)] = nums[i];
                    indices.remove(0);
                    indices.add(i);
                }
            }
        }
        return nums.length - count;
    }
}