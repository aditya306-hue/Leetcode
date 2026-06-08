class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int i=low; i<=high; i++){
            String str = Integer.toString(i);
            int length = str.length();
            if(length%2 == 0){
                int sum1 = 0;
                int sum2 = 0;
                for(int j=0; j<length; j++){
                    if(j <length/2){
                        sum1 += (int)str.charAt(j);
                    }else{
                        sum2 += (int)str.charAt(j);
                    }
                }
                if(sum1 == sum2){
                    count++;
                }
            }
        }
        return count;
    }
}