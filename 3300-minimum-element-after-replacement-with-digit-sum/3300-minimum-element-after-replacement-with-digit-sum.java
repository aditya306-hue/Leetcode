class Solution {
    public int minElement(int[] nums) {
        int minElem = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length ; i++){
            nums[i] = digitSum(nums[i]);
            minElem = Math.min(minElem , nums[i]);
        }
        return minElem;
    }

    public int digitSum(int num){
        int digitSum = 0;
        while(num != 0){
            digitSum += num % 10;
            num /= 10;
        }
        return digitSum;
    }
}