class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        long prefSum = 0;
        for(int i=0; i<shifts.length; i++){
            prefSum += shifts[i];
        }
        StringBuilder sb = new StringBuilder(s);
        for(int i=0; i<s.length(); i++){
            char ch = (char)('a' +(s.charAt(i) - 'a' + prefSum )% 26);
            sb.setCharAt(i ,  ch);
            prefSum -= shifts[i];
        }
        return sb.toString();
    }
}