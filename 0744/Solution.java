class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        // Solution 1: Brute-force attack
        // for(int i = 0; i < letters.length; i++) {
        //     if(letters[i] > target)
        //         return letters[i];
        // }
        // return letters[0];

        // Solution 2: Binary search
        int ph = 0;
        int pt = letters.length - 1;
        int res = 0; // the result index
        while(ph <= pt) {
            int mid = (ph + pt) / 2;
            if(letters[mid] > target) {
                res = mid;
                pt = mid - 1;
            } else {
                ph = mid + 1;
            }
        }
        return letters[res];
    }
}