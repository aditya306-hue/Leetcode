class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0; i<words.length; i++){
            int start = 0;
            int end = words[i].length() - 1;
            boolean isPalindromic = true;
            while(start < end){
                if(words[i].charAt(start) != words[i].charAt(end)){
                    isPalindromic = false;
                    break;
                }
                start++;
                end--;
            }
            if(isPalindromic == true){
                return words[i];
            }
        }
        return "";
    }
}