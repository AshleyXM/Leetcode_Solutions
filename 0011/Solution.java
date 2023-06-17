class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int ph = 0;
        int pt = height.length - 1;
        while(ph < pt) {
            if(Math.min(height[ph], height[pt]) * (pt - ph) > max) {
                max = Math.min(height[ph], height[pt]) * (pt - ph);
            }
            // move the pointer which points to smaller height
            if(height[ph] > height[pt]) {
                pt--;
            } else {
                ph++;
            }
        }
        return max;
    }
}