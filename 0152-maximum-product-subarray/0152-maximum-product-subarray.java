class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max= Integer.MIN_VALUE;
        int i =0;

        while(i<n){
            int prod =1;
            int j=i;

            while(j<n){
                prod = prod*nums[j];
                max=Math.max(max,prod);
                j++;
            }
            i++;
        }
        return max;

    }
}