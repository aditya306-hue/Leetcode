class Solution {
    public int findPeakElement(int[] nums) {
        int maxPeak = nums[0];
        int index = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]>maxPeak){
                maxPeak = nums[i];
                index = i;
            }
        }
        return index;
    }
}