// Brute force
class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, Comparator.comparingInt(a -> a[0]));
        int MAX = 100000;
        int pos = 0;
        int res = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int day = 1; day <= MAX; day++) {
            // optimize to end earlier
            if(pos == events.length && pq.size() == 0) {
                break;
            }
            // clean up events that already ended
            while(pq.peek() != null && pq.peek() < day) {
                pq.poll();
            }
            // add events that start on this day
            while(pos != events.length && events[pos][0] == day) {
                pq.offer(events[pos++][1]);  // add the end date into pq
            }
            if(pq.peek() != null) {
                pq.poll();
                res++;
            }
        }
        return res;
    }
}