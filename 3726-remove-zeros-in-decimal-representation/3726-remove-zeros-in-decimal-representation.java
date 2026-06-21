class Solution {
    public long removeZeros(long n) {
        long num = 0;
        int i = 0;
        while(n != 0){
            long lastDigit = n % 10;
            if(lastDigit != 0){
                num += Math.pow(10 , i) * lastDigit;
                i++;
            }
            n /= 10;
        }
        return num;
    }
}