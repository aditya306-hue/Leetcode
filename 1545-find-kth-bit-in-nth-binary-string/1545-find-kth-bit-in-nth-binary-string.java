class Solution {
    public char findKthBit(int n, int k) {
       StringBuilder sb = new StringBuilder("0");
        for(int i=1; i<n; i++){
            StringBuilder invertedReverse = new StringBuilder();
            for(int j=sb.toString().length()-1; j>=0; j--){
                if(sb.charAt(j) == '1'){
                    invertedReverse.append("0");
                }else{
                    invertedReverse.append("1");
                }
            }
            sb.append("1").append(invertedReverse);
        }
        return sb.charAt(k-1);
    }
}