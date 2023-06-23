class Solution {
    public int[][] merge(int[][] intervals) {
        // sort the intervals by the start value
        // The complete form of Arrays.sort() for 2d array
        // Arrays.sort(intervals, new Comparator<int[]>() {
        //     @Override
        //     public int compare(int[] o1, int[] o2) {
        //         return o1[0] - o2[0]; // sort by the first value in ascending order
        //     }
        // });
        
        // shorten the above code with a lambda expression
        Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]); // sort the intervals by the first value in ascending order

        int cur_start = intervals[0][0];
        int cur_end = intervals[0][1];
        List<int[]> ansList = new ArrayList<>();
        for(int i = 1; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            if(start <= cur_end) {
                cur_end = Math.max(cur_end, end);
            } else {
                ansList.add(new int[] {cur_start, cur_end});
                cur_start = start;
                cur_end = end;
            }
        }
        ansList.add(new int[] {cur_start, cur_end});
        return ansList.toArray(new int[ansList.size()][]); // ansList.toArray(newArray): dump ansList into newArray
    }
}