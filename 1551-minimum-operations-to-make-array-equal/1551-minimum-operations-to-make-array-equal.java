class Solution {
    public int minOperations(int n) {
       int arr[] = new int[n];
       int count = 0;
       for(int i=0; i<n; i++){
        arr[i] = 2*i + 1;
       }
       int start = 0;
       int end = n-1;
       while(start <= end){
        while(arr[start] != arr[end]){
            arr[start] += 1;
            arr[end] -= 1;
            count++;
        }
        start++;
        end--;
       }
       return count;
    }
}