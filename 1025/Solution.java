class Solution {
    public boolean divisorGame(int n) {
        // n = 0, false; n = 1, false; n = 2, true; n = 3, false...
        return (n == 0) ? false : (n % 2 == 0 ? true : false);
    }
}