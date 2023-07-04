class Solution {
    public int minTimeToType(String word) {
        char current = 'a';
        int times = word.length();
        for(int i = 0; i < word.length(); i++) {
            char tmp = word.charAt(i);
            // either clockwise or counterclockwise, add the smaller value
            times += Math.min((tmp - current + 26) % 26, (current - tmp + 26) % 26);
            current = tmp;
        }
        return times;
    }
}