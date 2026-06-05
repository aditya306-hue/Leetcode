class Solution {
    public int reverseBits(int n) {
        StringBuilder sb = new StringBuilder();
        while(n != 0){
            sb.append(n % 2);
            n /= 2;
        }
        int size = 32 - sb.length();
        while(size > 0){
            sb.append(0);
            size--;
        }
        int num = 0;
        int pow = 0;
        for(int i = sb.length() - 1; i>=0; i--){
            int digit = sb.charAt(i) - '0';
            num += digit * Math.pow(2 , pow);
            pow++;
        }
        return num;
    }
}