class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        int minRow[] = new int[m];
        Arrays.fill(minRow, Integer.MAX_VALUE);
        int maxCol[] = new int[n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                minRow[i] = Math.min(minRow[i] , matrix[i][j]);
                maxCol[j] = Math.max(maxCol[j] , matrix[i][j]);
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int num = matrix[i][j];
                if(num == minRow[i] && num == maxCol[j]){
                    ans.add(num);
                }
            }
        }
        return ans;
    }
}