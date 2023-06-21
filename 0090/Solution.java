class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int[] binary = new int[nums.length];
        binary[0] = -1;
        int count = 1;
        while(count <= Math.pow(2, nums.length)) {
            addOne(binary); // 1 - 2^n
            List<Integer> current = new ArrayList<>();
            for(int i = 0; i < nums.length; i++) {
                if(binary[i] != 0)
                    current.add(nums[i]);
            }
            if(!res.contains(current))
                res.add(current);
            count++;
        }
        return res;
    }

    public void addOne(int[] binary) {
        int pos = 0;
        binary[pos]++;
        while(binary[pos] == 2) {
            binary[pos++] = 0;
            binary[pos]++;
        }
    }
}