class Solution {
    public int thirdMax(int[] nums) {
        long max_one = Long.MIN_VALUE;
        long max_two = Long.MIN_VALUE;
        long max_three = Long.MIN_VALUE;
        boolean count = false;
        
        for(int i=0; i<nums.length; i++){
            if(max_one<nums[i]){
                max_one = nums[i];
            }
        }
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=max_one){
                if(max_two<nums[i]){
                    max_two = nums[i];
                }
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=max_one && nums[i]!=max_two){
                if(max_three<nums[i]){
                    max_three = nums[i];
                    count = true;
                    System.out.println(max_three);
                }
            }
        }
        if(count){
            return (int)max_three;
        }else{
            return (int)max_one;
        }
    }
}