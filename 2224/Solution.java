class Solution {
    public int convertTime(String current, String correct) {
        int h1 = Integer.parseInt(current.substring(0, 2));
        int h2 = Integer.parseInt(correct.substring(0, 2));
        int m1 = Integer.parseInt(current.substring(3, 5));
        int m2 = Integer.parseInt(correct.substring(3, 5));
        int mdiff = (m2 - m1) + (h2 - h1) * 60;
        int times = 0;
        if(mdiff > 0) {
            times += mdiff / 60;
            mdiff %= 60;
            times += mdiff / 15;
            mdiff %= 15;
            times += mdiff / 5;
            mdiff %= 5;
            times += mdiff / 1;
            mdiff %= 1;
        }
        return times;
    }
}