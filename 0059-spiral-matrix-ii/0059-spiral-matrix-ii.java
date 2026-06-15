class Solution {
    public int[][] generateMatrix(int n) {
        int num = 1;
        int arr[][] = new int[n][n];
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = n - 1;
        while(rowStart <= rowEnd && colStart <= colEnd){
            for(int j = colStart; j <= colEnd; j++){
                arr[rowStart][j] = num;
                num++;
            }
            for(int i = rowStart + 1; i <= rowEnd; i++){
                arr[i][colEnd] = num;
                num++;
            }
            for(int j = colEnd - 1; j >= colStart; j--){
                if(rowStart == rowEnd){
                    break;
                }
                arr[rowEnd][j] = num;
                num++;
            }
            for(int i = rowEnd - 1; i > rowStart; i--){
                if(colStart == colEnd){
                    break;
                }
                arr[i][colStart] = num;
                num++;
            }
            rowStart++;
            rowEnd--;
            colStart++;
            colEnd--;
        }
        return arr;
    }
}