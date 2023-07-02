class Solution {
    public int balancedStringSplit(String s) {
        int L = 0;
        int start = 0;
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'L')
                L++;
            if(L == (i - start + 1 - L)) { // the number of L is equal to the number of R
                start = i + 1;
                count++;
                L = 0;
            }
        }
        return count;
    }
}