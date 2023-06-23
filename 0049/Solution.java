class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hashmap = new HashMap<>();
        for(String str: strs) { // traverse string array
            char[] char_arr = str.toCharArray();
            Arrays.sort(char_arr);
            String key = String.valueOf(char_arr);
            // if(hashmap.containsKey(key)) {
            //     (hashmap.get(key)).add(str);
            // } else {
            //     List<String> tmp = new ArrayList<>();
            //     tmp.add(str);
            //     hashmap.put(key, tmp);
            // }

            // A easier way to implement the functionality done by the above commented code
            if(!hashmap.containsKey(key))
                hashmap.put(key, new ArrayList<String>());
            hashmap.get(key).add(str);
        }
        List<List<String>> res = new ArrayList<>();
        hashmap.forEach((key, value) -> { // traverse hashmap
            res.add(value);
        });
        return res;
    }
}