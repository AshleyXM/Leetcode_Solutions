/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        // The range of data that type int can represent is -2^31 ~ 2^31 - 1
        // The range of data that type long can represent is -2^63 ~ 2^63 - 1
        // ph + pt can be greater than the maximum value that type int can represent
        long ph = 1;
        long pt = n;
        int res = 0;
        while(ph <= pt) {
            int mid = (int)((ph + pt) / 2);
            System.out.println(mid);
            if(isBadVersion(mid)) {
                res = mid;
                pt = mid - 1;
            } else {
                ph = mid + 1;
            }
        }
        return res;
    }
}