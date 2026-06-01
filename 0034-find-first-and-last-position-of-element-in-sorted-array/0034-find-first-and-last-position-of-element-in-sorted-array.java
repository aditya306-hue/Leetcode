class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = {-1 , -1};
        int left = binarySearch(nums , target , true);
        int right = binarySearch(nums , target , false);
        ans[0] = left;
        ans[1] = right;
        return ans;
    }
    public int binarySearch(int[] nums , int target , boolean isSearchingLeft){
        int start = 0;
        int end = nums.length - 1;
        int idx = -1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] == target){
                idx = mid;
                if(isSearchingLeft){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else if(nums[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return idx;
    }
}