class Solution {
    public int findCircleNum(int[][] isConnected) {
        int[] status = new int[isConnected.length]; // record the status whether the city has been visited or not
        List<Integer> cities = new ArrayList<>(); // cities in the same province
        cities.add(0);
        status[0] = 1;
        int count = 1;
        while(indexOfZero(status) != -1) { // there still exists zeros in the array status
            int row = cities.get(0); // get the current city
            // find the cities which is connected to the current city
            for(int i = 0; i < isConnected.length; i++) {
                if(i != row && isConnected[row][i] == 1 && status[i] != 1) {
                    cities.add(i);
                    status[i] = 1;
                }
            }
            cities.remove(0);
            if(cities.size() == 0 && indexOfZero(status) != -1) {
                count++;
                cities.add(indexOfZero(status));
                status[indexOfZero(status)] = 1;
            }
        }
        return count;
    }

    public int indexOfZero(int[] arr) { // return the index of the first zero in the arr, or -1 (all ones)
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0)
                return i;
        }
        return -1;
    }
}