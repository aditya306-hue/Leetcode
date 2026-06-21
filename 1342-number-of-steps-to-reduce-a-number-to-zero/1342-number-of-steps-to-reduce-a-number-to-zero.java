class Solution {
    public int numberOfSteps(int num) {
        int minStep = 0;
        while(num != 0){
            if(num % 2 == 0){
                num /= 2;
                minStep++;
            }
            if(num % 2 != 0){
                num--;
                minStep++;
            }
        }
        return minStep;
    }
}