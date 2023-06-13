class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if(nums.length == 0)
            return res;
        int start = nums[0];
        int end;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i - 1] + 1) {
                if(nums[i - 1] != start) {
                    String tmp = start + "->" + nums[i - 1];
                    res.add(tmp);
                } else {
                    res.add("" + nums[i - 1]);
                }
                start  = nums[i];
            }
        }
        if(nums[nums.length - 1] == start) {
            res.add("" + nums[nums.length - 1]);
        } else {
            String tmp = start + "->" + nums[nums.length - 1];
            res.add(tmp);
        }
        return res;
    }
}