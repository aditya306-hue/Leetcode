class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int ans = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(count == 0){
                ans = nums[i];
            }
            if(ans == nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return ans;
    }
}