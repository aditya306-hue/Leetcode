class Solution {
    public int strStr(String haystack, String needle) {
        int start = 0;
        int end = needle.length();
        while(end <= haystack.length()){
            if(haystack.substring(start, end).equals(needle)){
                return start;
            }
            start++;
            end++;
        }
        return -1;
    }
}