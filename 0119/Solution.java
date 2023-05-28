class Solution {
    public List<Integer> getRow(int rowIndex) {
        // Solution 1: only need to change the return value
        // List<List<Integer>> total = new ArrayList<>();
        // for(int i = 1; i <= rowIndex + 1; i++) {
        //     List<Integer> current = new ArrayList<>();
        //     if(i >= 3) {
        //         List<Integer> previous = new ArrayList<>();
        //         previous = total.get(total.size() - 1); // get the last element in List total
        //         current.add(1); // add a one at the beginning
        //         for(int j = 0; j < previous.size() - 1; j++) {
        //             current.add(previous.get(j) + previous.get(j + 1));
        //         }
        //         current.add(1); // add a one in the end
        //     } else if(i == 1) {
        //         current.add(1);
        //     } else if(i == 2) {
        //         current.add(1);
        //         current.add(1);
        //     }
        //     total.add(current);
        // }
        // return total.get(rowIndex);

        // Solution 2: optimize the algorithm by reducing space cost
        List<Integer> current = new ArrayList<>();
        if(rowIndex == 0) {
            current.add(1);
        } else {
            current.add(1);
            current.add(1);
            for(int i = 2; i < rowIndex + 1; i++) {
                for(int j = 0; j < current.size() - 1; j++) {
                    current.set(j, current.get(j) + current.get(j + 1));
                }
                current.add(0, 1); // add a one at the beginning
            }
        }
        return current;
    }
}