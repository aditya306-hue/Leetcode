class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i = 2; i < n - 1; i++){
            int base = i;
            int num_Copy = n;
            int numB = 0;
            int conNum = 0;
            int pow = 0;
            while(num_Copy != 0){
                int rem = (num_Copy % base);
                numB += (int)Math.pow(base , pow) * rem;
                conNum = conNum * 10 + rem;
                num_Copy /= base;
                pow++;
            }
            if(conNum != numB){
                return false;
            }
        }
        return true;
    }
}