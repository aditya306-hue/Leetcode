class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int maxBar = 0;
        for(int i = 0; i<costs.length; i++){
            maxBar += costs[i];
            if(maxBar > coins){
                return i;
            }

        }
        return costs.length;
    }
}
