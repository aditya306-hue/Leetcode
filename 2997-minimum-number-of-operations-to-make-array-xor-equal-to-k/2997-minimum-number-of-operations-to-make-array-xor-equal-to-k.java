class Solution {
    public int minOperations(int[] nums, int k) {
        int arr_xor = 0;
        for(int i=0; i<nums.length; i++){
            arr_xor ^= nums[i];
        }
        int xor_k = arr_xor ^ k;
        int count = 0;
        while(xor_k != 0){
            if((xor_k & 1) != 0){
                count++;
            }
            xor_k >>= 1;
        }
        return count;
    }
}