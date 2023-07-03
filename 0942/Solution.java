class Solution {
    public int[] diStringMatch(String s) {
        int low = 0, high = s.length();
        int[] res = new int[s.length() + 1];
        int pres = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'I') {
                res[pres] = low++;
            } else { // s.charAt(i) == 'D'
                res[pres] = high--;
            }
            pres++;
        }
        res[pres] = low; // low == high at last
        return res;
    }
}