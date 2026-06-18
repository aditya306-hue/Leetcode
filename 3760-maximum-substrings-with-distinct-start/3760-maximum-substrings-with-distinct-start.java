class Solution {
    public int maxDistinct(String s) {
        int freqChar[] = new int[26];
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            freqChar[ch - 'a']++;
        }
        for(int i = 0; i < freqChar.length; i++){
            if(freqChar[i] > 0){
                count++;
            }
        }
        return count;
    }
}