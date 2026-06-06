class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int and = left;
        while(left < right){
            right = right & (right - 1);
        }
        return right;
    }
}