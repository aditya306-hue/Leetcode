class Solution {
    public int maxFreqSum(String s) {
        int freq[] = new int[26];
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        int maxVowel = 0;
        int maxConst = 0;
        for(int i = 0;  i < freq.length; i++){
            if(isVowel((char)('a' + i))){
                maxVowel = Math.max(maxVowel , freq[i]);
            }else{
                maxConst = Math.max(maxConst , freq[i]);
            }
        }
        return maxVowel + maxConst;
    }
    public boolean isVowel(char ch){
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
}