class Solution {
    public int distMoney(int money, int children) {
        int[] distribution = new int[30]; // the maximum children is 30
        if(money < children)
            return -1;
        money -= children; // give everyone one dollar first
        for(int i = 0; i < children; i++) {
            distribution[i] = 1;
        }
        int count = 0; // the number of children who get eight dollars
        int pointer = 0;
        while(money != 0) {
            if(pointer == children)
                pointer = count;
            if(count >= children) { // all the children got 8 dollars but the money > 0
                // give all the rest to one of the children, and then count should be one less
                return count - 1;
            }
            if(distribution[pointer] != 8 && money >= 7) {
                // if with enough money, give the current child seven dollars to have eight dollars in total
                distribution[pointer] += 7;
                money -= 7;
                count++;
            } else if(distribution[pointer] != 3 && money > 0) {
                // increment one dollar if the amount of the current child is not three dollars
                distribution[pointer]++;
                money--;
            } else if(distribution[pointer] == 3 && money >= 2) {
                // if the current child has 3 dollars and money > 2, give him two dollars
                distribution[pointer] += 2;
                money -= 2;
            } else if(distribution[pointer] == 3 && money == 1) {
                if(count != 0 && pointer != count + 1 && pointer == children - 1)
                // the previous children all got 8 dollars already and the current child is the last child
                    count--;
                money = 0;
            }
            pointer++; // move the pointer to the next child
        }
        return count;
    }
}