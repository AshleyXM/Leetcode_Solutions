class Solution {
    public int minFlips(int a, int b, int c) {
        int count = 0;
        while(a != 0 || b != 0 || c != 0) {
            if(c % 2 != ((a % 2) | (b % 2))) {
                if(c % 2 == 0) // count += the number of ones between the current bit of a and b
                    count += (a % 2) + (b % 2);
                else // both the current bit of a and b is zero, but the current bit of c is one
                    count += 1; // one bit is the minimum bit that will work 
            }
            // shift one bit to the right for a, b and c
            a /= 2;
            b /= 2;
            c /= 2;
        }
        return count;
    }
}