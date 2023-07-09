class Solution {
    public int minMaxDifference(int num) {
        String numStr = String.valueOf(num);
        int minIndex = -1, maxIndex = -1;
        for(int i = 0; i < numStr.length(); i++) {
            if(numStr.charAt(i) != '9' && maxIndex == -1) maxIndex = i;
            if(numStr.charAt(i) != '0' && minIndex == -1) minIndex = i;
            if(minIndex != -1 && maxIndex != -1)
                break;
        }
        int min = num;
        if(minIndex != -1) min = Integer.parseInt(numStr.replace(numStr.charAt(minIndex), '0'));
        int max = num;
        if(maxIndex != -1) max = Integer.parseInt(numStr.replace(numStr.charAt(maxIndex), '9'));
        return max - min;
    }
}