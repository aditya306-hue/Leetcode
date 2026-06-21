class Solution {
    public int countMonobit(int n) {
        int monoBit = 0;
        for(int i=0; i<=n; i++){
            int count = 0;
            int count1 = 0;
            int num = i;
            while(num != 0){
                count++;
                if((num & 1) != 0){
                    count1++;
                }
                num = num>>1;
            }
            if(count == count1 || count1 == 0){
                monoBit++;
            }
        }
        return monoBit;
    }
}