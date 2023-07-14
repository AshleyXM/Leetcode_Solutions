class Solution {
    public int countVowelStrings(int n) {
        int[] dp = new int[5];
        for(int i = 0; i < 5; i++)
            dp[i] = 1;
        while(n > 1) {
            for(int i = 3; i >= 0; i--)
                dp[i] += dp[i + 1]; // add the current vowel to the front of the strings whose first letter is the same as the current one or lexicographically after the current one
            n--;
        }
        int res = 0;
        for(int i = 0; i < 5; i++)
            res += dp[i];
        return res;
    }
}
// Intuition:
// 1+1+1+1+1=5
// 5+4+3+2+1=15
// (5+4+3+2+1)+(4+3+2+1)+(3+2+1)+(2+1)+1