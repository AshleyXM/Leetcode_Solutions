class Solution {
    public int minimumMoves(String s) {
        int sum = 0;
        int pointer = 0;
        while(pointer < s.length()) {
            if(s.charAt(pointer) == 'O') {
                pointer++;
            } else {
                sum++;
                pointer += 3;
            }
        }
        return sum;
    }
}