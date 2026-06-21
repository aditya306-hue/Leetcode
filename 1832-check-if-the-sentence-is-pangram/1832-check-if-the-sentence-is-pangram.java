class Solution {
    public boolean checkIfPangram(String sentence) {
        int arr[] = new int[26];
        for(int i=0; i<sentence.length(); i++){
            int idx = sentence.charAt(i) - 97;
            arr[idx]++;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                return false;
            }
        }
        return true;
    }
}