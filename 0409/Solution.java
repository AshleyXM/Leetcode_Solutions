class Solution {
    public int longestPalindrome(String s) {
        int[] times = new int[26 * 2]; // a - z, A - Z
        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if(current >= 'a' && current <= 'z')
                times[current - 'a']++;
            else if(current >= 'A' && current <= 'Z')
                times[current - 'A' + 26]++;
        }
        int flag = 0; // odd times
        int sum = 0;
        for(int i = 0; i < times.length; i++) {
            if(times[i] % 2 == 0) sum += times[i];
            else {
                sum += times[i] - 1;
                flag = 1;
            }
        }
        return sum + flag;
    }
}