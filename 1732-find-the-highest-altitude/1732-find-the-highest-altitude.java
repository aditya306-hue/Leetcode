class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = 0; //leftSum
        int maxAltitude = Integer.MIN_VALUE;
        for(int i = 0; i<gain.length; i++){
            altitude += gain[i];
            maxAltitude = Math.max(altitude , maxAltitude);
        }
        return maxAltitude < 0 ? 0 : maxAltitude;
    }
}