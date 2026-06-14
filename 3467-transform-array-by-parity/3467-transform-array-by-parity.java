class Solution {
    public int[] transformArray(int[] nums) {
        int count_zero = 0;
        int count_one = 0;
        int Cnum[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2 == 0){
                Cnum[i] = 0;
                count_zero++;
            }else{
                Cnum[i] = 1;
                count_one++;
            }
        }
        for(int i=0; i<Cnum.length; i++){
            if(count_zero>0){
                Cnum[i] = 0;
                count_zero--;
            }else{
                Cnum[i] = 1;
            }
        }
        return Cnum;
    }
}