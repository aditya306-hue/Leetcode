class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        for(int i=0; i<=num; i++){
             int revNum= 0;
             int n = i;
            while(n != 0){
                int lastDigit = n % 10;
                revNum = revNum*10 + lastDigit;
                n /= 10;
            }
            if(i + revNum == num){
                return true;
            }
        }
        return false;
    }
}