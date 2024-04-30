class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
            // Arrays.sort(candidates);
            List<List<Integer>> res = new ArrayList<>();
            List<Integer> path = new ArrayList<>();
            dfs(candidates, 0, candidates.length, target, path, res);
            return res;
    }

    public void dfs(int[] candidates, int left, int right, int target, List<Integer> path, List<List<Integer>> res) {
        // base case
        if(target < 0) {
            return;
        } else if(target == 0) {
            res.add(List.copyOf(path)); // 不能写成res.add(path)，因为path是reference，会导致最后为空列表
            return;
        }

        // recursive part
        for(int idx = left; idx < right; idx++) {
            path.add(candidates[idx]);
            // System.out.println(path.toString());
            dfs(candidates, idx, right, target - candidates[idx], path, res);
            path.remove(path.size() - 1); // remove the last node in path
        }
    }
}