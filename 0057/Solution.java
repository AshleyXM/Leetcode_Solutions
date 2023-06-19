class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<Integer> list = new ArrayList<>(); // store the intervals temporarily because in Java, 2d array must have fixed first dimension length
        int start = newInterval[0];
        int end = newInterval[1];
        if(intervals.length == 0) {
            list.add(start);
            list.add(end);
        }
        int flag = 0; // 0 - searching the position of start, 1 - searching the position of end
        int num = 0;
        for(; num < intervals.length; num++) {
            if(flag == 0) { // search where start should be located
                if(start < intervals[num][0]) {
                    list.add(start);
                    flag = 1;
                } else if(start >= intervals[num][0] && start <= intervals[num][1]) {
                    list.add(intervals[num][0]);
                    flag = 1;
                } else if(start > intervals[num][1]) {
                    list.add(intervals[num][0]);
                    list.add(intervals[num][1]);
                    if(num == intervals.length - 1) {
                        list.add(start);
                        list.add(end);
                    }
                }
            }

            if(flag == 1) { // flag == 1, search where end should be located
                if(end < intervals[num][0]) {
                    list.add(end);
                    break;
                } else if(end >= intervals[num][0] && end <= intervals[num][1]) {
                    list.add(intervals[num][1]);
                    num++;
                    break;
                } else if(end > intervals[num][1]) {
                    if(num == intervals.length - 1) {
                        list.add(end);
                        num++;
                        break;
                    }
                }
            }
        }
        // add all the rest intervals into List res
        for(int i = num; i < intervals.length; i++) {
            list.add(intervals[i][0]);
            list.add(intervals[i][1]);
        }
        // store the results into a 2d array
        int size = list.size();
        int[][] res = new int[size / 2][2];
        for(int i = 0; i < size / 2; i++) {
            for(int j = 0; j < 2; j++) {
                res[i][j] = list.get(2 * i + j);
            }
        }
        return res;
    }
}