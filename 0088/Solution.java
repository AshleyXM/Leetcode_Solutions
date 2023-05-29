class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m + n];
        int p1 = 0;
        int p2 = 0;
        int pres = 0;
        while(p1 < m && p2 <n) {
            if(nums1[p1] < nums2[p2]) {
                res[pres++] = nums1[p1++];
            } else {
                res[pres++] = nums2[p2++];
            }
        }
        while(p1 < m) {
            res[pres++] = nums1[p1++];
        } 
        while(p2 < n) {
            res[pres++] = nums2[p2++];
        }
        for(int i = 0; i < m + n; i++) {
            nums1[i] = res[i];
        }
    }
}