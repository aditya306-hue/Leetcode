class Solution {
    public String mergeAlternately(String word1, String word2) {
        int start = 0;
        int end;
        if(word2.length() > word1.length()){
            end = word1.length() - 1;
        }else{
            end = word2.length() - 1;

        }
        StringBuilder sb = new StringBuilder();
        while(start <= end){
            sb.append(word1.charAt(start));
            sb.append(word2.charAt(start));
            start++;
        }
        if(word2.length() > word1.length()){
            sb.append(word2.substring(word1.length() , word2.length()));
        }else if(word2.length() < word1.length()){
            sb.append(word1.substring(word2.length() , word1.length()));
        }
        return sb.toString();
    }
}