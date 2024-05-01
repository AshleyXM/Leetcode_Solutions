class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int[] flags = new int[nums.length]; // defaults to be all 0
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        dfs(nums, flags, path, res);
        return res;
    }

    public void dfs(int[] nums, int[] flags, List<Integer> path, List<List<Integer>> res) {
        // int sum = 0;
        // for(int i = 0; i < flags.length; i++) {
        //     sum += flags[i];
        // }
        // if(sum == flags.length) {
        //     res.add(List.copyOf(path));
        //     return;
        // }

        if(path.size() == flags.length) {
            res.add(List.copyOf(path));
            return;
        }

        for(int idx = 0; idx < nums.length; idx++) {
            if(flags[idx] != 1) {
                flags[idx] = 1;
                path.add(nums[idx]);
                dfs(nums, flags, path, res);
                flags[idx] = 0;
                path.remove(path.size() - 1);
            }
        }
    }
}