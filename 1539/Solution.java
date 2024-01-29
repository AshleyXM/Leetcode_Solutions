class Solution {
    public int findKthPositive(int[] arr, int k) {
        int current = 1;
        int count = 0;
        for(int i = 0; i < arr.length;) {
            if(arr[i] == current) {
                i++;
            } else {
                count++;
            }
            if(count == k) {
                return current;
            }
            current++;
        }
        return current - 1 + (k - count);
    }
}