class Solution {
    public int numSpecial(int[][] mat) {
        int count = 0;
        int len_row = mat.length;
        int len_col = mat[0].length;
        int row[] = new int[len_row];
        int col[] = new int[len_col];
        for(int i=0; i<len_row; i++){
           for(int j=0; j<len_col; j++){
                if(mat[i][j] == 1){
                    row[i]++;
                    col[j]++;
                }
           }
        }
        for(int i=0; i<len_row; i++){
            for(int j=0; j<len_col; j++){
                if(row[i] == 1 && col[j] == 1 && mat[i][j] == 1){
                    count++;
                }
            }
        }
        return count;
    }
}