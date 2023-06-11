/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        // The range of data that type int can represent is -2^31 ~ 2^31 - 1
        // The range of data that type long can represent is -2^63 ~ 2^63 - 1
        // ph + pt can be greater than the maximum value that type int can represent
        // Solution 1: Binary search to find the minimum index whose isBadVersion() is false
        // long ph = 1;
        // long pt = n;
        // int res = 0;
        // while(ph <= pt) {
        //     int mid = (int)((ph + pt) / 2);
        //     if(isBadVersion(mid)) {
        //         res = mid;
        //         pt = mid - 1;
        //     } else {
        //         ph = mid + 1;
        //     }
        // }
        // return res;

        // Solution 2: A variation of solution 1
        long ph = 1;
        long pt = n;
        while(ph < pt) { // DO NOT write <= since it will enter dead loop
            int mid = (int)((ph + pt) / 2);
            if(isBadVersion(mid)) {
                pt = mid; // different from what solution 1 did
            } else {
                ph = mid + 1;
            }
        }
        return (int)pt;
    }
}