class Solution {
    public int hammingDistance(int x, int y) {
        
        int count = 0;

        for(int i=0; i<32; i++){
            int xDigit = (x & (1<<i));
            int yDigit = (y & (1<<i));
            if(xDigit != yDigit){
                count++;
            }
        }
        return count;

    }
}