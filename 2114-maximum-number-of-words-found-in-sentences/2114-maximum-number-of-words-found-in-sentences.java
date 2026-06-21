class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxCount = 0;
        for(int i=0; i<sentences.length; i++){
            int count = 0;
            int start = 0;
            int end = sentences[i].length();
            while(start < end){
                if(sentences[i].charAt(start) == ' '){
                    count++;
                }
                start++;
            }
            count++;
            maxCount = Math.max(maxCount , count);
        }
        return maxCount;
    }
}