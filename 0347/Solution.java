class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>(); // number: times
        for(int i = 0; i < nums.length; i++) {
            if(hm.containsKey(nums[i])) {
                hm.replace(nums[i], hm.get(nums[i]) + 1); // update the value
            } else {
                hm.put(nums[i], 1);
            }
        }
        int[] times = new int[100000];
        int times_size = 0;
        // traverse HashMap via forEach: store all the occurrence times of all the numbers
        for(Map.Entry<Integer, Integer> entry: hm.entrySet()) {
            System.out.println(entry.getValue());
            times[times_size++] = entry.getValue();
        }
        Arrays.sort(times, 0, times_size); // from small to large
        int[] res = new int[k];
        int res_size = 0;
        for(Map.Entry<Integer, Integer> entry: hm.entrySet()) {
            if(entry.getValue() >= times[times_size - k]) { // times[times_size - k] is the kth frequent times
                res[res_size++] = entry.getKey();
            }
        }
        return res;
    }
}