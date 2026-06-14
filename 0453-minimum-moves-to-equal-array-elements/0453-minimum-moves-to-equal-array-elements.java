class Solution {
    public int minMoves(int[] nums) {
        int minElem = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<minElem){
                minElem = nums[i];
            }
        }
        int count = 0;
        for(int i=0; i<nums.length; i++){
            count += nums[i] - minElem;
        }
        return count;
    }
}