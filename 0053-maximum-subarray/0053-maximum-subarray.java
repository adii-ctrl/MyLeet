class Solution {
    public int maxSubArray(int[] nums) {
        int sum =0;
        int a=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            a=Math.max(a,sum);
            if(sum<0){
                sum=0;
            }
        }
        return a;
    }
}