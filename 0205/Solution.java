class Solution {
    public boolean isIsomorphic(String s, String t) {
        // Solution 1: use hashmap to store the mapping relation
        // if(s.length() != t.length()) // the length of the two strings are different
        //     return false;
        // else {
        //     HashMap<Character, Character> map = new HashMap<Character, Character>();
        //     String new_str = "";
        //     for(int i = 0; i < s.length(); i++) {
        //         // traverse the two strings whose lengths are equal
        //         if(map.containsKey(s.charAt(i))) {
        //             new_str += map.get(s.charAt(i));
        //         } else {
        //             // no two characters can map to the same character
        //             if(map.containsValue(t.charAt(i))) 
        //                 return false;
        //             map.put(s.charAt(i), t.charAt(i));
        //             new_str += t.charAt(i);
        //         }
        //     }
        //     if(t.equals(new_str))
        //         return true;
        //     else
        //         return false;
        // }

        // Solution 2: utilize the difference
        if(s.length() != t.length())
            return false;
        else {
            HashMap<Character, Integer> map = new HashMap<Character, Integer>();
            String codes = "";
            for(int i = 0; i < s.length(); i++) {
                if(map.containsKey(s.charAt(i))) {
                    if(map.get(s.charAt(i)) != (s.charAt(i) - t.charAt(i)))
                        return false;
                } else {
                    if(codes.indexOf(t.charAt(i)) != -1)
                        return false;
                    map.put(s.charAt(i), s.charAt(i) - t.charAt(i));
                    codes += t.charAt(i);
                }
            }
            return true;
        }
    }
}