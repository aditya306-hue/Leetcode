class Solution {
    public int[] findArray(int[] pref) {
        int[] prefXOr = new int[pref.length];
        prefXOr[0] = pref[0];
        for(int i=1; i<pref.length; i++){
           prefXOr[i] = pref[i] ^ pref[i-1];
        }
        return prefXOr;
    }
}