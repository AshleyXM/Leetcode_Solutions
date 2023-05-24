class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] characters = new int[128];
        int max = 0; // empty string
        for(int i = 0; i < s.length(); i++) {
            int t_max = 1;
            characters[s.charAt(i)-0] = 1;
            for(int j = i + 1; j < s.length(); j++) {
                if(characters[s.charAt(j)-0] == 0) {
                    characters[s.charAt(j)-0] = 1;
                    t_max++;
                } else {
                    break;
                }
            }
            if(t_max > max) {
                max = t_max;
            }
            for(int k = 0; k < 128; k++) { // clear array characters
                characters[k] = 0;
            }
        }
        return max;
    }
}