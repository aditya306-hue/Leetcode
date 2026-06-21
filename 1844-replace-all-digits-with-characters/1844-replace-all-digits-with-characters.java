class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i=0; i<s.length(); i++){
            if(i%2 != 0){
                int ch = s.charAt(i-1) + (s.charAt(i) - '0');
                sb.setCharAt(i , (char)ch);
            }
        }
        return sb.toString();
    }
}