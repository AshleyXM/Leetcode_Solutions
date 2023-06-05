class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0)
            return false;
        else if(n < 1) {
            while(n < 1)
                n *= 2;
            if(n == 1)
                return true;
            return false;
        } else { // n >= 1
            while(n > 1) {
                if(n % 2 == 1)
                    return false;
                n /= 2;
            }
            return true;
        }
    } 
}