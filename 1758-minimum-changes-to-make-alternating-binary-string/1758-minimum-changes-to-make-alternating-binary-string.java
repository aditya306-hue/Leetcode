class Solution {
    public int minOperations(String s) {
        int pattern1 = 0;
        int pattern2 = 0;
        for(int i=0; i<s.length(); i++){
            //pattern1
            if((i%2 == 0 && s.charAt(i) != '0') || (i%2 != 0 && s.charAt(i) != '1')){
                pattern1++;
            }
            //pattern2
            if((i%2 == 0 && s.charAt(i) != '1')  || (i%2 != 0 && s.charAt(i) != '0')){
                pattern2++;
            }
        }
        return Math.min(pattern1 , pattern2);
    }
}