class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count_one = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '1'){
                count_one++;
            }
        }
        StringBuilder sb = new StringBuilder();
        int i =  0;
        while(i < s.length() - 1){
            if(count_one-- > 1){
                sb.append(1);
            }else{
                sb.append(0);
            }
            i++;
        }
        sb.append(1);
        return sb.toString();
    }
}