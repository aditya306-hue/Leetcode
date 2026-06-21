class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        int arrLower[] = new int[26];
        int arrUpper[] = new  int[26];
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                arrLower[ch - 'a']++;
            }else{
                arrUpper[ch - 'A']++;
            }
        }
        for(int i=0; i<26; i++){
            if(arrLower[i] > 0 && arrUpper[i] > 0){
                count++;
            }
        }
        return count;
    }
}