class Solution {
    public int smallestIndex(int[] nums) {
         for(int i = 0; i < nums.length; i++){
            int idx = digitSum(nums[i]);
            if(idx == i){
                return i;
            }
         }
         return -1;
    }
    public static int digitSum(int num){
        int digitsSum = 0;
        while(num > 0){
            int lastDigit = num % 10;
            num /= 10;
            digitsSum += lastDigit;
        }
        return digitsSum;
    }
}