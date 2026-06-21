class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if( ch >= 97 && ch <= 122 || ch>= 48 && ch<=57 ){
                sb.append(s.charAt(i));
            }
        }
        int start =0;
        int end = sb.toString().length() - 1;
        while(start < end){
            if(sb.charAt(start) != sb.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}