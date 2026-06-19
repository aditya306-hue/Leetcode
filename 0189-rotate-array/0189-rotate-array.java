class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(0 , n - 1 , nums);
        reverse(0 , k - 1 , nums);
        reverse(k , n - 1 , nums);
    }
    public void reverse(int st , int end , int arr[]){
        while(st < end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }
}