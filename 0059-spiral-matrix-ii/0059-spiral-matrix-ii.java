class Solution {
    public int[][] generateMatrix(int n) {
        int SpiralMatrix[][] = new int[n][n];
        int startRow = 0;
        int startCol = 0;
        int endRow = n-1;
        int endCol = n-1;
        int num = 1;
        while(startRow<=endRow && startCol<=endCol){
            //top
            for(int j=startCol; j<=endCol; j++){
                SpiralMatrix[startRow][j] = num;
                num++;
            }
            //Right
            for(int i=startRow+1; i<=endRow; i++){
                SpiralMatrix[i][endRow] = num;
                num++;
            }
            //bottom
            for(int j=endCol-1; j>=startCol; j--){
                if(endRow == startRow){
                    break;
                }
                SpiralMatrix[endRow][j] = num;
                num++;
            }
            //left
            for(int i = endRow-1; i>startRow; i--){
                if(startCol == endCol){
                    break;
                }
                SpiralMatrix[i][startCol] = num;
                num++;
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return SpiralMatrix;
    }
}