class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        // 如果只用来查找，hashset的速度比list要快，这里如果用list会导致超时
        Set<Integer> obsSet = new HashSet<>();
        // 用hashset存储后面查找速度将大大提升（和遍历obstacles数组相比）
        for(int i = 0; i < obstacles.length; i++) {
            obsSet.add(obstacles[i][0] * 60001 + obstacles[i][1]); // 60001是由xi,yi的范围决定的
        }
        int[][] direction = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int face =  0;
        int xPos = 0, yPos = 0;
        int max = 0;
        for(int i = 0; i < commands.length; i++) {
            if(commands[i] == -1) {
                face = (face + 1) % 4;
            } else if(commands[i] == -2) {
                face = (face + 3) % 4;
            } else {
                for(int j = 0; j < commands[i]; j++) {
                    int xNext = xPos + direction[face][0];
                    int yNext = yPos + direction[face][1];
                    if(!obsSet.contains(xNext * 60001 + yNext)) {
                        xPos = xNext;
                        yPos = yNext;
                        if(xPos * xPos + yPos * yPos > max) {
                            max = xPos * xPos + yPos * yPos;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        return max;
    }
}