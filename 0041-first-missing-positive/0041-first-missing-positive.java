class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int ans = 1;
        for(int i = 0; i<nums.length; i++){
            if(ans == nums[i]){
                ans++;
            }else if(ans < nums[i]){
                return ans;
            }
        }
        return ans;
    }
}