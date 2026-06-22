class Solution {
    public int sumOfUnique(int[] nums) {
        int n = 0;
        int uniqSum = 0;
        for(int i = 0; i < nums.length; i++){
            n = Math.max(n , nums[i]);
        }
        int freq[] = new int[n + 1];
        for(int i = 0; i < nums.length; i++){
            freq[nums[i]]++;
        }
        for(int i = 0; i < nums.length; i++){
            if(freq[nums[i]] == 1){
                uniqSum += nums[i];
            }
        }
        return uniqSum;
        // int uniqueSum = 0;
        // for(int i = 0; i < nums.length; i++){
        //     boolean isDup = false;
        //     for(int j = 0; j < nums.length; j++){
        //         if(i != j && nums[i] == nums[j]){
        //             isDup = true;
        //         }
        //     }
        //     if(!isDup){
        //         uniqueSum += nums[i];
        //     }
        // }
        // return uniqueSum;

    }
}