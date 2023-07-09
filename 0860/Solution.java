class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0; // twenty dollars can never be the change
        for(int i = 0; i < bills.length; i++) {
            if(bills[i] == 5) {
                five++;
            }
            else if(bills[i] == 10) {
                if(five > 0) {
                    five--;
                    ten++;
                } else {
                    return false;
                }
            } else {
                if(ten > 0 && five > 0) { // 10 + 5, greedy
                    ten--;
                    five--;
                } else if(five >= 3) { // 5 + 5 + 5
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}