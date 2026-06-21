class Solution {
    public int mirrorDistance(int n) {
        int revNum  = 0;
        int num = n;
        while(num != 0){
            int lastDigit = num % 10;
            revNum = revNum * 10 + lastDigit;
            num /= 10;
        }
        return Math.abs(n - revNum);
    }
}