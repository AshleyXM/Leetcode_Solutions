class Solution {
    public int findCircleNum(int[][] isConnected) {
        int numOfCities = isConnected.length;
        boolean[] visited = new boolean[numOfCities];
        int province = 0;
        for(int i = 0; i < numOfCities; i++) {
            if(!visited[i]) {
                dfs(isConnected, i, visited);
                province++;
            }
        }
        return province;
    }

    public void dfs(int[][] isConnected, int current, boolean[] visited) {
        int[] adj = isConnected[current];
        for(int i = 0; i < adj.length; i++) {
            if(adj[i] == 1 && !visited[i]) {
               visited[i] = true;
               dfs(isConnected, i, visited);
            }
        }
    }
}