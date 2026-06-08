class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length -1;
        int endCol = matrix[0].length -1;
        List<Integer> SpiralList = new ArrayList<>();
        while(startRow<=endRow && startCol<=endCol){
            //top
            for(int j = startCol; j<=endCol ; j++){
                SpiralList.add(matrix[startRow][j]);
            }
            //Right
            for(int i= startRow+1; i<=endRow; i++){
                SpiralList.add(matrix[i][endCol]);
            }
            //bottom
            for(int j = endCol-1; j>=startCol; j--){
                if(endRow == startRow){
                    break;
                }
                SpiralList.add(matrix[endRow][j]);
            }
            //Left
            for(int i=endRow-1; i>startRow; i--){
                if(endCol == startCol){
                    break;
                }
                SpiralList.add(matrix[i][startCol]);
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return SpiralList;
    }
}