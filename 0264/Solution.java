// Solution 1: Min-heap
class Solution {
    public int nthUglyNumber(int n) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        Set<Long> set = new HashSet<>(); // 利用HashSet标记某个值是否添加过
        // add the first number
        pq.offer(1L);
        set.add(1L);
        long min = 1;
        int[] factors = {2, 3, 5}; // 减少if条件重复的次数->循环factors里的每个factor
        while(n > 0) {
            min = pq.poll();
            n--;
            for(int factor: factors) {
                if(set.add(min * factor)) { // 已存在返回true，不存在则添加并返回false
                    pq.offer(min * factor);
                }
            }
        }
        return (int)min;
    }
}