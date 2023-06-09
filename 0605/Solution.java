class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        if(flowerbed.length == 1) {
            if(flowerbed[0] + n <= 1) // true: (0, 0), (0, 1), (1, 0), false: (1, 1) 
                return true;
            return false;
        }
        // flowerbed >= 2
        if((flowerbed[0] + flowerbed[1] == 0)) {
            flowerbed[0] = 1;
            count++;
        }
        int ploop = 1;
        for(; ploop < flowerbed.length - 1; ploop++) { // flowerbed.length >= 3
            if(flowerbed[ploop - 1] + flowerbed[ploop] + flowerbed[ploop + 1] == 0) {
                flowerbed[ploop] = 1;
                count++;
            }
            if(count >= n) // reduce the number of loops 
                return true;
        }
        // deal with the last element separately
        if(flowerbed[ploop - 1] + flowerbed[ploop] == 0) {
            count++;
        }
        if(count >= n)
            return true;
        return false;
    }
}