class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder(word);
        int start = 0;
        int end = word.indexOf(ch);
        while(start < end){
            char temp = word.charAt(start);
            sb.setCharAt(start , word.charAt(end));
            sb.setCharAt(end , temp);
            start++;
            end--;
        }
        return sb.toString();
    }
}