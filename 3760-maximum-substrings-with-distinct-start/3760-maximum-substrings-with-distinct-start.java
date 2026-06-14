class Solution {
    public int maxDistinct(String s) {
        int count = 0;
        int arr[] = new int[26];
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int idx = 122 - (int)ch;
            arr[idx]++;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                count++;
            }
        }
        return count;
    }
}