class Solution {
    public int findKthLargest(int[] nums, int k) {
       PriorityQueue<Integer> pq = new PriorityQueue<>( Comparator.reverseOrder());
       for(int i = 0; i < nums.length; i++){
            pq.add(nums[i]);
       }
       int largestNum = 0;
       while(k != 0){
        largestNum = pq.remove();
        k--;
       }
       return largestNum;
    }
}