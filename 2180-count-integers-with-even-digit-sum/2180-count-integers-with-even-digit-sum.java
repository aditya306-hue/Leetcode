class Solution {
    public int countEven(int num) {
        int count =0;
        for(int i=1; i<= num; i++){
            int nums = i;
            int digitSum = 0;
            while(nums > 0){
                digitSum += nums%10;
                nums /= 10;
            }
            if(digitSum % 2 == 0){
                count++;
            }
        }
        return count;
    }
}