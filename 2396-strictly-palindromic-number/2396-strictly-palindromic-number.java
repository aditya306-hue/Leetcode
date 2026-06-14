class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2; i<=n-2; i++){
            int num = n;
            int convertedNum = 0;
            int converted_rev = 0;
            int pow = 0;
            while(num>0){
                int lastDigit = num % i;
                convertedNum = convertedNum * 10 + lastDigit;
                converted_rev += (int)Math.pow(10 , pow) * lastDigit;
                num /= i;
                pow++;
            }
            if(convertedNum != converted_rev){
                return false;
            }
        }
        return true;
    }
}