class Solution {
    public int minimumCost(int[] cost) {
        int  candy = 0;
        Arrays.sort(cost);
        int count = 0;
        for(int i = cost.length - 1; i >= 0; i--){
            candy += cost[i];
            count++;
            if(count >= 2 ){
                count = 0;
                i--; 
            }
        }
        return candy;
    }
}