class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strArr = s.split(" ");
        if(strArr.length != pattern.length())
            return false;
        Map<Character, String> hashmap = new HashMap<Character, String>();
        for(int i = 0; i < pattern.length(); i++) {
            if(hashmap.containsKey(pattern.charAt(i))) {
                if(!hashmap.get(pattern.charAt(i)).equals(strArr[i]))
                    return false;
            } else {
                if(!hashmap.containsValue(strArr[i]))
                    hashmap.put(pattern.charAt(i), strArr[i]);
                else return false;
            }
        }
        return true;
    }
}