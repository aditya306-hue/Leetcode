class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<words.length; i++){
            int sum = 0;
            for(int j=0; j<words[i].length(); j++){
                int idx = words[i].charAt(j) - 'a';
                sum += weights[idx];
            }
            sum %= 26;
            sb.append((char)('z' - sum));
        }
        return sb.toString();
    }
}