class Solution {
    public void sortColors(int[] nums) {
        // Solution 1: A dumb solution, just counting the number of zeros and ones
        int zeros = 0;
        int ones = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) zeros++;
            else if(nums[i] == 1) ones++;
        }
        int pointer = 0;
        while(pointer < nums.length) {
            if(pointer < zeros) nums[pointer] = 0;
            else if(pointer < zeros + ones) nums[pointer] = 1;
            else nums[pointer] = 2;
            pointer++;
        }

        // Solution 2: A sorting method similar to bubble sorting
        // for(int i = nums.length - 1; i >= 0; i--) {
        //     int maxIndex = 0;
        //     for(int j = 1; j <= i; j++) {
        //         if(nums[j] > nums[maxIndex]) maxIndex = j;
        //     }
        //     int tmp = nums[i];
        //     nums[i] = nums[maxIndex];
        //     nums[maxIndex] = tmp;
        // }

        // Solution 3: Three pointers which point to zero, one and two individually
        // int zero = 0, one = 0, two = nums.length - 1;
        // while(one <= two) {
        //     if(nums[one] == 0) {
        //         nums[one] = nums[zero];
        //         nums[zero] = 0;
        //         zero++;
        //         one++; // all the numbers in the left of pointer one are <= 1
        //     } else if(nums[one] == 2) {
        //         nums[one] = nums[two];
        //         nums[two] = 2;
        //         two--;
        //         // CANNOT increment pointer one here, because the previous nums[two] can be 2
        //     } else { // nums[one] == 1
        //         one++;
        //     }
        // }
    }
}