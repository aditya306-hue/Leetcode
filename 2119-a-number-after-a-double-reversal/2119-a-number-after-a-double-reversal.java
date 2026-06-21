class Solution {
    public boolean isSameAfterReversals(int num) {
        int revNum = reverse(num);
        revNum = reverse(revNum);
        return num == revNum;
    }
    public int reverse(int num){
        int revNum = 0;
        while(num != 0){
            int lastDigit = num % 10;
            revNum = revNum * 10 + lastDigit;
            num /= 10;
        }
        return revNum;
    }
}