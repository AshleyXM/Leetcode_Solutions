class Solution {
    public int minPartitions(String n) {
        // The minimum number is determined by the maxinum digit in the given n
        int max = 0;
        for(int i = 0; i < n.length(); i++) {
            if(n.charAt(i) - '0' > max) max = n.charAt(i) - '0';
            if(max == 9) break;
        }
        return max;
    }
}