class Solution {
    public long maxAlternatingSum(int[] nums) {
        long ans =  0;
        for(int i =  0; i < nums.length; i++){
            nums[i] =  Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        while(start < end){
            ans += nums[end] * nums[end] - nums[start] * nums[start];
            start++;
            end--;
        }
        if(start == end){
            ans  += nums[start] * nums[start];
        }
        return ans;
    }
}