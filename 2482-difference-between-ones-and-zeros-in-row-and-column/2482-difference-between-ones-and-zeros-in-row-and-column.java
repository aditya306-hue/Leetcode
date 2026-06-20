class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        //Count Frequency of One;
        int row[] = new int[n];
        int col[] = new int[m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 1){
                    row[i]++;
                    col[j]++;
                }
            }
        }
        //Calculating Difference
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                grid[i][j] = 2*(row[i] + col[j]) - n - m;
                // grid[i][j] = row[i] + col[j] - (n - row[i] + m - col[j]);
            }
        }
        return grid;

    }
}