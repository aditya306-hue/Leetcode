class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            String str = Integer.toString(nums[i]);
            for(int j=0; j<str.length(); j++){
                list.add(str.charAt(j)- '0');
            }
        }
        int[] arr = new int[list.size()];
        for(int i=0;  i<list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}