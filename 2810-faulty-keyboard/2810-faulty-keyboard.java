class Solution {
    public String finalString(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != 'i'){
                sb.append(s.charAt(i));
            }else{
                int start = 0;
                int end = sb.toString().length()-1;
                while(start < end){
                    char temp = sb.charAt(start);
                    sb.setCharAt(start , sb.charAt(end));
                    sb.setCharAt(end , temp);
                    start++;
                    end--;
                }
            }
        }
        return sb.toString();
    }
}