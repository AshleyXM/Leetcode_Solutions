class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] inDegrees = new int[numCourses]; // 标记每门课的入度
        List<List<Integer>> relationship = new ArrayList<>(); // 前置课->后置课列表
        for(int i = 0; i < numCourses; i++) {
            relationship.add(new ArrayList<>());
        }
        for(int i = 0; i < prerequisites.length; i++) {
            inDegrees[prerequisites[i][0]]++;
            relationship.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < numCourses; i++) {
            if(inDegrees[i] == 0) queue.add(i);
        }
        while(!queue.isEmpty()) {
            Integer ele = queue.poll();
            numCourses--;
            for(Integer num: relationship.get(ele)) {
                inDegrees[num]--;
                if(inDegrees[num] == 0) queue.add(num);
            }
        }
        return numCourses == 0;
    }
}