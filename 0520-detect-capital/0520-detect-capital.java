class Solution {
    public boolean detectCapitalUse(String word) {
        int capital = 0;
        int small = 0;
        int n = word.length();
        for(int i=0; i<n; i++){
            char ch  =  word.charAt(i);
            if(ch >=  'a' && ch <= 'z'){
                small++;
            }else{
                capital++;
            }
        }
        if(small == n || capital == n || (capital ==  1 && (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z'))){
            return true;
        }
        return false;
    }
}