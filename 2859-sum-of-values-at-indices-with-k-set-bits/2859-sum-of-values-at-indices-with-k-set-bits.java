class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int count = 0;
        for(int i=0; i<nums.size(); i++){
            int setBits = countSetBit(i);
            if(setBits == k){
                count += nums.get(i);
            }
        }
        return count;
    }
    public static int countSetBit(int n){
        int count = 0;
        while(n != 0){
            int bitMask = n & 1;
            if(bitMask != 0){
                count++;
            }
            n = n>>1;
        }
        return count;
        
    }
}