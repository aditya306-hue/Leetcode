class Solution {
    public boolean isPalindrome(int x) {
        int RevNum = 0;
        int num = x;
        while(num>0){
            int lastDigit = num%10;
            num/=10;
            RevNum = RevNum*10 + lastDigit;
        }
        if(x == RevNum){
            return true;
        }else{
            return false;
        }
    }
}