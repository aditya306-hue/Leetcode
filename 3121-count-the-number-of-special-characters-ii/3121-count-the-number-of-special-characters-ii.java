class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        int arrLower[][] = new int[26][2];
        int arrUpper[][] = new  int[26][2];
        for(int i=0; i<26; i++){
            arrUpper[i][1] = -1;
        }
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                arrLower[ch - 'a'][0]++;
                arrLower[ch - 'a'][1] = i;
            }else{
                arrUpper[ch - 'A'][0]++;
                if(arrUpper[ch - 'A'][1] == -1){
                    arrUpper[ch - 'A'][1] = i;
                }
            }
        }
        for(int i=0; i<26; i++){
            if(arrLower[i][0] > 0 && arrUpper[i][0] > 0 && arrLower[i][1] < arrUpper[i][1]){
                count++;
            }
        }
        return count;
    }
}