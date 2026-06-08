class Solution {
    public int addDigits(int num) {
        int SumDigit = num;
        int Digit = 0;
        while(true){
            int lastDigit = SumDigit % 10;
            SumDigit /= 10;
            Digit += lastDigit ;
            if(SumDigit == 0){
                SumDigit = Digit;
                Digit = 0;
                if(SumDigit < 10){
                    return SumDigit;
                }
            }
            
        }
    }
}