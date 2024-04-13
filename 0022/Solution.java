class Solution {
    public List<String> generateParenthesis(int n) {
        Set<String> res = new HashSet<>();
        for(int i = 0; i < n; i++) {
            Set<String> tmp = new HashSet<>(res);
            if(tmp.size() == 0) {
                res.add("()");
            } else {
                res = new HashSet<>();
                for(String str: tmp) {
                    for(int j = 0; j <= str.length(); j++) {
                        res.add(str.substring(0, j) + "()" + str.substring(j, str.length()));
                    }
                }
            }
        }
        return new ArrayList<String>(res);
    }
}