class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<n; i++){
            for(int j=0 ; j<n; j++){
                pq.add(matrix[i][j]);
            }
        }
        int num = 0;
        while(!pq.isEmpty() && k != 0){
            num = pq.remove();
            k--;
        }
        return num;
    }
}