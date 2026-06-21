class Solution {
    public int countCommas(int n) {
        if(n < 1000){
            return 0;
        }
        int totCommas = n - 999;
        return totCommas;
        
        
    }
}