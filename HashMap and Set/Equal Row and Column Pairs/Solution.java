class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int count = 0;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (equalMatch(grid, row, col)) {
                    count++;
                }
            }
        }

        return count;
    }

    public boolean equalMatch(int[][] grid, int row, int col) {
        for(int i = 0; i < grid.length; i++) {
            if(grid[row][i] != grid[i][col]) {
                return false;
            }
        }
        return true;
    }
}