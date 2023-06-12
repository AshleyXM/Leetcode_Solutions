class Solution {
    int[] flag = new int[10]; // store the status of 1 - 9
    public boolean isFascinating(int n) {
        if(isLegal(n) && isLegal(2 * n) && isLegal(3 * n)) // only all the three numbers are wanted then return true
            return true;
        return false;
    }

    // return whether the current number is what is wanted or not
    public boolean isLegal(int num) {
        while(num != 0) {
            if(num % 10 == 0 || flag[num % 10] == 1)
                return false;
            else
                flag[num % 10] = 1;
            num /= 10;
        }
        return true;
    }
}