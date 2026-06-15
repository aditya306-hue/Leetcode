class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        if(n <= 2){
            return n;
        }
        int ans = 2;
        for(int i=0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int count = 2;

                int x1 = points[i][0];
                int y1 = points[i][1];
                int x2 = points[j][0];
                int y2 = points[j][1];

                for(int k = j+1; k < n; k++){
                    int x3 = points[k][0];
                    int y3 = points[k][1];
                    if((y2 - y1) * (x3 - x1) == (y3 - y1) * (x2 - x1)){
                        count++;
                    }
                }
                ans = Math.max(ans , count);
            }
        }
        return ans;
    }
}