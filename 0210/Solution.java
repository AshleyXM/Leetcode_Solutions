class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] inDegrees = new int[numCourses];
        List<List<Integer>> relationship = new ArrayList<>();
        // 初始化relationship
        for(int i = 0; i < numCourses; i++) {
            relationship.add(new ArrayList<>());
        }
        for(int i = 0; i < prerequisites.length; i++) {
            int[] tmp = prerequisites[i];
            inDegrees[tmp[0]]++;
            relationship.get(tmp[1]).add(tmp[0]);
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < numCourses; i++) {
            if(inDegrees[i] == 0) queue.add(i);
        }
        int[] res = new int[numCourses];
        int count = 0;
        while(!queue.isEmpty()) {
            Integer ele = queue.poll();
            res[count++] = ele;
            for(Integer course: relationship.get(ele)) {
                inDegrees[course]--;
                if(inDegrees[course] == 0) queue.add(course);
            }
        }
        if(count == numCourses) {
            return res;
        }
        return new int[0];
    }
}