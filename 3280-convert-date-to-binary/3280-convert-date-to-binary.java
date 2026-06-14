class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder sb = new StringBuilder();
        String yr = date.substring(0,4);
        int year = Integer.parseInt(yr);
        String m = date.substring(5,7);
        int month = Integer.parseInt(m);
        String d = date.substring(8,10);
        int day = Integer.parseInt(d);
        sb.append(convertBinary(year));
        sb.append('-');
        sb.append(convertBinary(month));
        sb.append('-');
        sb.append(convertBinary(day));
        return sb.toString();
    }
    public static long convertBinary(int num){
        long binNum = 0;
        int pow = 0;
        while(num>0){
            int lastDigit = num%2;
            num /= 2;
            binNum += lastDigit*Math.pow(10 , pow);
            pow++;
        }
        return binNum;
    }
}