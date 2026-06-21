class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb  = new StringBuilder(s);
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 65 && ch <= 90 ){
                ch += 32;
                sb.setCharAt(i , ch);
            }
            
        }
        return sb.toString();
    }
}