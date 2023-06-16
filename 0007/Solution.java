class Solution {
    public int reverse(int x) {
        int rvs = 0;
        int sign = 1;
        if(x < 0) {
            sign = -1;
            x = -x;
        }
        while(x != 0) {
            int remainder = x % 10;
            if(rvs <= (Integer.MAX_VALUE - remainder) / 10) { // rvs * 10 + remainder <= Integer.MAX_VALUE
                rvs = rvs * 10 + remainder;
                x /= 10;
            } else {
                return 0;
            }
        }
        rvs = sign * rvs;
        return rvs;
    }
}