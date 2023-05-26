class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> dictionaries = new HashMap<Character, Integer>();
        dictionaries.put('I', 1);
        dictionaries.put('V', 5);
        dictionaries.put('X', 10);
        dictionaries.put('L', 50);
        dictionaries.put('C', 100);
        dictionaries.put('D', 500);
        dictionaries.put('M', 1000);

        int sum = 0;
        for(int i= 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            if(tmp == 'I' && i + 1 < s.length()) {
                if(s.charAt(i+1) == 'V') {
                    sum += 4;
                    i++;
                    continue;
                } else if(s.charAt(i+1) == 'X') {
                    sum += 9;
                    i++;
                    continue;
                }
            } else if(tmp == 'X' && i + 1 < s.length()) {
                if(s.charAt(i+1) == 'L') {
                    sum += 40;
                    i++;
                    continue;
                } else if(s.charAt(i+1) == 'C') {
                    sum += 90;
                    i++;
                    continue;
                }
            } else if(tmp == 'C' && i + 1 < s.length()) {
                if(s.charAt(i+1) == 'D') {
                    sum += 400;
                    i++;
                    continue;
                } else if(s.charAt(i+1) == 'M') {
                    sum += 900;
                    i++;
                    continue;
                }
            }
            sum += dictionaries.get(tmp);
        }
        return sum;
    }
}