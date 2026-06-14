class Solution {
    public int smallestEvenMultiple(int n) {
        int i = 2;
        while(n<=150){
            if(n % n == 0 && n % 2 == 0){
                return n;
            }else{
                n = n*i;
                i++;
            }
        }
        return n;
    }
}