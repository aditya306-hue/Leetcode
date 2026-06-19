class Solution {
    public boolean isValid(String word) {
        int n = word.length();
        if(n < 3){
            return false;
        }
        boolean isVowel = false;
        boolean isConsonant = false;
        for(int i = 0; i < n; i++){
            char ch = word.charAt(i);
            if(!isAlnum(ch)){
                return false;
            }
            if(isVowel(ch)){
                isVowel = true;
            }
            if(isCons(ch)){
                isConsonant = true;
            }
        }
        return isVowel && isConsonant;
    }
    public boolean isVowel(char ch){
        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'
        || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        return false;
    }
    public boolean isAlnum(char ch){
        if((ch >= 'A' && ch <= 'Z') 
            || (ch >= 'a' && ch <= 'z') 
            || (ch >= '0' && ch <= '9')){
                return true;
        }
        return false;
    }
    public boolean isCons(char ch){
        if(!isVowel(ch) && ((ch >= 'A' && ch <= 'Z') 
            || (ch >= 'a' && ch <= 'z')) ){
            return true;
        }
        return false;
    }
}