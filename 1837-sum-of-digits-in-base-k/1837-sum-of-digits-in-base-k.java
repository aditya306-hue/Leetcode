class Solution {
    public int sumBase(int n, int k) {
        int num = n;
        int sum = 0;
        while(num>0){
            int lastDigit = num % k;
            num/=k;
            sum+= lastDigit;
        }
        return sum;
    }
}