class Solution {
    public String greatestLetter(String s) {
        int arrLower[] =new int[26];
        int arrUpper[] = new int[26];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                arrLower[ch - 'a']++;
            }else{
                arrUpper[ch  - 'A']++;
            }
        }
        for(int i=25; i>= 0; i--){
            if(arrLower[i] > 0 && arrUpper[i] > 0){
                return String.valueOf((char)('A' + i));
            }
        }
        return "";
    }
}