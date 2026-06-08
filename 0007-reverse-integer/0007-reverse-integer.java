class Solution {
    public int reverse(int x) {
        long RevNum = 0;
        while(x!=0){
            int lastDigit = x%10;
            x/=10;
            RevNum = RevNum*10 + lastDigit;
        }
        if ( RevNum > Integer.MAX_VALUE || RevNum < Integer.MIN_VALUE) {
            return 0;
        }else{
            return (int) RevNum;
        }
        
        
    }
}