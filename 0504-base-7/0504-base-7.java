class Solution {
    public String convertToBase7(int num) {
        StringBuilder sb = new StringBuilder();
        int convNum = 0;
        int pow = 0;
        while(num != 0){
            int lastDigit = num%7;
            convNum += (int)Math.pow(10 , pow) * lastDigit;
            num /= 7;
            pow++;
        }
        sb.append(convNum);
        return sb.toString();
    }
}