class Solution {
    public String reverseByType(String s) {
        StringBuilder sb = new StringBuilder(s);
        int start = 0;
        int end = s.length()-1;
        //Reverse LowerCases
        while(start <= end){
            boolean startChar = (s.charAt(start) >= 97 && s.charAt(start) <= 122) || (s.charAt(start) >= 65 && s.charAt(start) <= 90);
            boolean endChar = (s.charAt(end) >= 97 && s.charAt(end) <= 122) || (s.charAt(end) >= 65 && s.charAt(end) <= 90);
            if(!startChar){
                start++;
            }else if(!endChar){
                end--;
            }else{
                char temp = sb.charAt(start);
                sb.setCharAt(start , sb.charAt(end));
                sb.setCharAt(end , temp);
                start++;
                end--;
            }
        }
        //Reverse Special Character
        start = 0;
        end = s.length() - 1;
        while(start <= end){
            boolean startChar = (s.charAt(start) >= 97 && s.charAt(start) <= 122) || (s.charAt(start) >= 65 && s.charAt(start) <= 90);
            boolean endChar = (s.charAt(end) >= 97 && s.charAt(end) <= 122) || (s.charAt(end) >= 65 && s.charAt(end) <= 90);
            if(startChar){
                start++;
            }else if(endChar){
                end--;
            }else{
                char temp = sb.charAt(start);
                sb.setCharAt(start , sb.charAt(end));
                sb.setCharAt(end , temp);
                start++;
                end--;
            }
        }
        return sb.toString();
    }
}