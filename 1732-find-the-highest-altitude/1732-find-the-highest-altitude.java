class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int altitude=0;
        int maxAltitude =0;

        for(int i =0;i<n;i++){
            altitude+=gain[i];
            maxAltitude=Math.max(altitude,maxAltitude);
        }
        return maxAltitude;
    }
}