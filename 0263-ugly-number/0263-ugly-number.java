class Solution {
    public boolean isUgly(int n) {
        if(n <= 0){
            return false;
        }
        int factor[] = {2 , 3, 5};
        for(int i=0; i<factor.length; i++){
            while(n%factor[i] == 0){
                n /= factor[i];
            }
        }
        if(n == 1){
            return true;
        }else{
            return false;
        }
    }
}