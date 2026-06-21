class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int maxGap = 0;
        for(int i=1; i<nums.length; i++){
            int curr = Math.abs(nums[i] - nums[i-1]);
            maxGap = Math.max(maxGap ,  curr);
        }
        return maxGap;
    }
}