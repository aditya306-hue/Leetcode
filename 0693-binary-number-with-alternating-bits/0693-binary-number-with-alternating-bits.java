class Solution {
    public boolean hasAlternatingBits(int n) {
        int ld = n & 1;
        while(n != 0){
             n >>= 1;
            if(ld == (n & 1)){
                return false;
            }
            ld = n & 1;
        }
        return true;
    }
}