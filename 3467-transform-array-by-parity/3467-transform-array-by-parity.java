class Solution {
    public int[] transformArray(int[] nums) {
        int freq[] = new int[2];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                freq[0]++;
            }else{
                freq[1]++;
            }
        }
        int j = 0;
        for(int i = 0; i < freq.length;i++){
            while(freq[i] > 0){
                nums[j++] = i;
                freq[i]--;
            }
        }
        return nums;
    }
}