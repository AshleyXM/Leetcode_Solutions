class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> hs1 = new ArrayList<Integer>();
        List<Integer> hs2 = new ArrayList<Integer>();
        HashSet<Integer> common = new HashSet<Integer>();
        // store all numbers in array nums1 once into hs1
        for(int i = 0; i < nums1.length; i++) {
            if(!hs1.contains(nums1[i]))
                hs1.add(nums1[i]);
        }
        // store all numbers in array nums2 once into hs2
        for(int i = 0; i < nums2.length; i++) {
            if(!hs2.contains(nums2[i]))
                hs2.add(nums2[i]);
        }
        // store the common numbers between nums1 and nums2 into hashset common
        for(int i = 0; i < hs1.size(); i++) {
            if(hs2.contains(hs1.get(i))) {
                common.add(hs1.get(i));
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> res1 = new ArrayList<Integer>();
        List<Integer> res2 = new ArrayList<Integer>();
        for(int i = 0; i < hs1.size(); i++) {
            if(!common.contains(hs1.get(i)))
                res1.add(hs1.get(i));
        }
        for(int i = 0; i < hs2.size(); i++) {
            if(!common.contains(hs2.get(i)))
                res2.add(hs2.get(i));
        }
        res.add(res1);
        res.add(res2);
        return res;
    }
}