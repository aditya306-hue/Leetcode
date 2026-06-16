class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if( ch >= 'a' && ch <= 'z'){
                sb.append(ch);
            }else if(ch == '*'){
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            }else if(ch == '#'){
                sb.append(sb.toString());
            }else if(ch == '%'){
                reverse(sb);
            }
        }
        return sb.toString();
    }
    public void reverse(StringBuilder sb){
        int start = 0;
        int end = sb.length() - 1;
        while(start < end){
            char temp = sb.charAt(start);
            sb.setCharAt(start , sb.charAt(end));
            sb.setCharAt(end , temp);
            start++;
            end--;
        }
    }
}