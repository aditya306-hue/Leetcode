class Solution {
    public int maximum69Number (int num) {
        // StringBuilder sb = new StringBuilder(Integer.toString(num));
        StringBuilder sb = new StringBuilder(new String(num + ""));
        for(int i = 0; i < sb.length() ; i++){
            if(sb.charAt(i) == '6'){
                sb.setCharAt(i , '9');
                break; 
            }
        }
        num = Integer.valueOf(sb.toString());
        return num;
    }
}