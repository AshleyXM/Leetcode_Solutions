class Solution {
    public int maxDistance(int[] colors) {
        int low = 0, high = colors.length - 1;
        while(colors[0] == colors[high] && high >= 0)
            high--;
        while(colors[low] == colors[colors.length - 1] && low <= colors.length - 1)
            low++;
        return Math.max(high, colors.length - 1 - low);
    }
}