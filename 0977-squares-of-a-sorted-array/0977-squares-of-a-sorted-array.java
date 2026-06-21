class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans[] = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int i = nums.length - 1;
        while(left <= right){
            int l = Math.abs(nums[left]);
            int r  = Math.abs(nums[right]);
            if(l > r){
                ans[i--] = l*l;
                left++;
            }else{
                ans[i--] = r*r;
                right--;
            }
        }
        return ans;
    } 
}