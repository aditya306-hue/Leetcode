class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int start = 0;
        int end = s.length() - 1;
        String vowels = "AEIOUaeiou";
        while(start < end){
            while(start < end && vowels.indexOf(sb.charAt(start)) == -1){
                start++;
            }
            while(start < end && vowels.indexOf(sb.charAt(end)) == -1){
                end--;
            }
            char temp =  sb.charAt(start);
            sb.setCharAt(start , sb.charAt(end));
            sb.setCharAt(end , temp);
            start++;
            end--;
        }
        return sb.toString();
    }
}