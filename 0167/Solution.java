class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i = 0; i < numbers.length - 1; i++) {
            if(i != 0 && numbers[i] == numbers[i - 1]) continue;  // optimize
            int diff = target - numbers[i];
            if(diff < numbers[i]) continue;
            int left = i + 1, right = numbers.length - 1;
            while(left <= right) {
                int mid = (left + right) / 2;
                if(numbers[mid] == diff) {
                    return new int[] {i + 1, mid + 1};
                } else if(numbers[mid] > diff) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return new int[]{-1, -1};
    }
}