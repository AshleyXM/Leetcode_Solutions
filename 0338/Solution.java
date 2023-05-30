class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        int[] current = new int[20];
        int num = 0;
        int pres = 1;
        res[0] = 0; // the binary of 0 has no ones
        for(int i = 1; i <= n; i++) {
            int pcur = 0;
            int cur_1 = 0; // the number of one in this loop
            while(current[pcur] == 1) { // find the first zero from right to left
                cur_1++;
                current[pcur] = 0;
                pcur++; // move the pointer on array current
            }
            current[pcur] = 1; // add one to the current number
            res[pres] = res[pres - 1] + 1 - cur_1;
            pres++;
        }
        return res;
    }
}