// Solution 1
/*class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int[] res = new int[intervals.length];
        int idx = 0;
        for(int i = 0; i < intervals.length; i++) {
            int[] cur = intervals[i];
            int pos = -1;
            for(int j = 0; j < intervals.length; j++) {
                int[] tra = intervals[j];
                if(tra[0] >= cur[1]) {
                    if(pos == -1 || 
                        (pos != -1 && tra[0] < intervals[pos][0])) {
                        pos = j;
                    }
                }
            }
            res[idx++] = pos;
        }
        return res;
    }
}*/

// Solution 2
class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int[][] startMap = new int[intervals.length][2];
        for(int i = 0; i < intervals.length; i++) {
            startMap[i] = new int[] {intervals[i][0], i};
        }
        Arrays.sort(startMap, Comparator.comparingInt(a -> a[0]));
        int[] res = new int[intervals.length];
        for(int i = 0; i < intervals.length; i++) {
            int left = 0, right = startMap.length - 1;
            int target = -1;
            while(left <= right) {
                int mid = (left + right) / 2;
                if(startMap[mid][0] >= intervals[i][1]) {
                    target = startMap[mid][1];
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            res[i] = target;
        }
        return res;
    }
}