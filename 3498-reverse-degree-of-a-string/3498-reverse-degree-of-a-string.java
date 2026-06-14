class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        char chz = 'z';
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int diff = chz - ch + 1;
            sum += diff*(i+1);
        }
        return sum;
    }
}