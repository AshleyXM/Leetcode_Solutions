class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        // Sort by the second dimension
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        int lastEnd = intervals[0][1];
        int res = 1;
        int len = intervals.length;
        for(int i = 1; i < len; i++) {
            if(intervals[i][0] >=  lastEnd) {
                res++;
                lastEnd = intervals[i][1];
            }
        }
        return len - res;
    }
}