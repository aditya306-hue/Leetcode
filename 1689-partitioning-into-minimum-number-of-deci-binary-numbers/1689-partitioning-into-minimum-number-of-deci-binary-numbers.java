class Solution {
    public int minPartitions(String n) {
        int maxDeciNum = 0;
        for(int i  = 0; i < n.length(); i++){
            maxDeciNum = Math.max(maxDeciNum , n.charAt(i) - '0');
        }
        return maxDeciNum;
    }
}