class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        int[] degrees = new int[n];
        List<List<Integer>> relationship = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            relationship.add(new ArrayList<>());
        }
        for(int i = 0; i < edges.length; i++) {
            int[] edge = edges[i];
            degrees[edge[0]]++;
            degrees[edge[1]]++;
            relationship.get(edge[0]).add(edge[1]);
            relationship.get(edge[1]).add(edge[0]);
        }
        Set<Integer> visited = new HashSet<>(); // 存储已经访问过的结点
        List<Integer> res = new ArrayList<>(); // 记录每轮度数为1的结点
        Queue<Integer> queue = new LinkedList<>(); // 存储当前度数为1的结点
        for(int i = 0; i < n; i++) {
            if(degrees[i] == 0) res.add(i);
            if(degrees[i] == 1) queue.add(i);
        }
        if(res.size() != 0) return res;
        while(visited.size() < n) {
            if(queue.isEmpty()) break;
            res = new ArrayList<>();
            Queue<Integer> tmpQueue = new LinkedList<>(); // 临时存储下一轮度数为1的结点
            while(!queue.isEmpty()) { // 遍历当前所有度数为1的结点
                Integer ele = queue.poll();
                visited.add(ele); // 将此结点标记为已访问
                res.add(ele);
                for(Integer adj: relationship.get(ele)) {
                    if(!visited.contains(adj)) { // 如果这个相邻节点没有访问过
                        if(--degrees[adj] == 1) tmpQueue.add(adj);
                    }
                }
            }
            queue = new LinkedList<>(tmpQueue); // 将下一轮要遍历的结点copy到queue中
        }
        return res;
    }
}