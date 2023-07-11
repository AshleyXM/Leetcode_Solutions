class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
            sum += arr[i];
        if(sum % 3 != 0) return false; // the sum of integers CANNOT be of type double
        int flag = 1;
        int pointer = 0;
        int part_sum = 0;
        while(pointer < arr.length) {
            part_sum += arr[pointer++];
            if(part_sum == sum / 3) {
                if(flag == 3) return true; // Whether pointer == arr.length - 1 or not does not matter! (If not, then the sum of the rest must be equal to 0.)
                flag++;
                part_sum = 0;
            }
        }
        return false;
    }
}