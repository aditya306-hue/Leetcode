class Solution {
    public long makeIntegerBeautiful(long n, int target) {
        long x = 0;
        long mul  = 1;
        while( digitSum(n + x) > target){
           mul *= 10;
           x = mul - n % mul;
        }
        return x;
    }
    public long digitSum(long num){
        long sum = 0;
        while(num != 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}