class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        ArrayList<Integer> List = new ArrayList();
        int count = 0;
        for(int i=1; i<height.length; i++){
            if(height[i-1] > threshold){
                List.add(i);
            }
        }
        return List;
    }
}