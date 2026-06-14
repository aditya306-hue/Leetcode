class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums);
        int count = 0;
        for(int i=0; i<nums.length-1; i++){
            int xor = nums[i]^nums[i+1];
            if(xor == 0){
                count++;
                list.add(nums[i]);
                i++;
            }
        }
        return list;
    }
}