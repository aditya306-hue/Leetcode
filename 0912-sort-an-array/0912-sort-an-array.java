class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums , 0 , nums.length-1);
        return nums;
    }
    public void mergeSort(int arr[] , int si , int ei){
        if(si >= ei){
            return;
        }
        int mid = (si + ei)/2;
        mergeSort(arr ,  si , mid);
        mergeSort(arr , mid + 1 , ei);
        merge(arr , si , mid , ei);
    }
    public void merge(int arr[] , int si , int mid , int ei){
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while(i<= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //for leftover elements of 1st sorted part
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        //for leftover elements of 2nd sorted part
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        //copy temp to original  array
        for(k=0 , i=si ; k<temp.length; k++ , i++){
            arr[i] = temp[k];
        }
    }
}