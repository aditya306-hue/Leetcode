class Solution {
    public int[] evenOddBit(int n) {
        int[] arr = new int[2];
        int i = 0;
        while(n > 0){
            if((n & 1) != 0){
                if(i%2 ==0){
                    arr[0] += 1;
                }else{
                    arr[1] += 1;
                }
            } 
            n = n>>1;
            i++;
        }
        return arr;
    }
}