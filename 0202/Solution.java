class Solution {
    public boolean isHappy(int n) {
        // The most tricky part is about how to record the loop
        // so that we can conclude that a loop happens and stop
        HashSet<Integer> hs = new HashSet<Integer>();
        int sum = n;
        while(!hs.contains(sum)) {
            if(sum == 1)
                return true;
            hs.add(sum); // record which number has been traversed
            int tmp = 0;
            while(sum != 0) { // get new number by summing the squares of each digits
                tmp += Math.pow(sum % 10, 2);
                sum /= 10;
            }
            sum = tmp;
        }
        return false;
    }
}