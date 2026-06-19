class Solution {
    public char findKthBit(int n, int k) {
        StringBuilder sb = new StringBuilder("0");
        for(int i = 1; i < n; i++){
            reverseInvert(sb);
        }
        return sb.charAt(k - 1);
    }
    public void reverseInvert(StringBuilder sb1){
        StringBuilder sb = new StringBuilder(sb1);
        int start = 0;
        int end = sb.length() - 1;
        while(start < end){
            char temp = sb.charAt(start) == '0' ? '1' : '0';
            sb.setCharAt(start , sb.charAt(end) == '0' ? '1' : '0');
            sb.setCharAt(end , temp);
            start++;
            end--;
        }
        if(start == end){
            sb.setCharAt(start , sb.charAt(start) == '0' ? '1' : '0');
        }
        sb1.append(1);
        sb1.append(sb);
    }
}