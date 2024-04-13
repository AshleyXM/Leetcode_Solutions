class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character, String> mapping_table = new HashMap<>();
        mapping_table.put('2', "abc");
        mapping_table.put('3', "def");
        mapping_table.put('4', "ghi");
        mapping_table.put('5', "jkl");
        mapping_table.put('6', "mno");
        mapping_table.put('7', "pqrs");
        mapping_table.put('8', "tuv");
        mapping_table.put('9', "wxyz");
        List<String> result = new ArrayList<>();
        for(char ch: digits.toCharArray()) {
            List<String> tmp = List.copyOf(result);
            if(tmp.size()==0) {
                for(char letter: mapping_table.get(ch).toCharArray()) {
                    result.add(String.valueOf(letter));
                }
            } else {
                result = new ArrayList<>();
                for(String str: tmp) {
                    for(char letter:mapping_table.get(ch).toCharArray()) {
                        result.add(str + letter);
                    }
                }
            }
        }
        return result;
    }
}