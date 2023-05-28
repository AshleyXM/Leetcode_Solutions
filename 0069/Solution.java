class Solution {
    public int mySqrt(int x) {
        int start = 0;
        int end = x;
        // speed up the exploring process by using binary search
        while(start <= end) {
            // if using int to store mid, then mid * mid will overflow, so it is better to use long type
            long mid = (long)((start + end) /2);
            if(mid * mid > x) {
                end = (int)mid -1;
            } else if(mid * mid < x) {
                start = (int)mid + 1;
            } else {
                return (int)mid;
            }
        }
        return end;
    }
}