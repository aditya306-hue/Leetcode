class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int rows = grid.length;
        int col = grid[0].length;
        int row_ones[] = new int[rows];
        int col_ones[] = new int[col];
        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j] == 1){
                    row_ones[i]++;
                    col_ones[j]++;
                }
            }
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                grid[i][j] = 2*row_ones[i] + 2* col_ones[j] - rows - col;
            }
        }
        return grid;
    }
}