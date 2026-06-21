class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> List = new ArrayList();
        for(int i=0; i<words.length; i++){
            int start = 0;
            int end = words[i].length() - 1;
            while(start <= end){
                if(words[i].charAt(start) == x || words[i].charAt(end) == x){
                    List.add(i);
                    break;
                }
                start++;
                end--;
            }
        }
        return List;
    }
}