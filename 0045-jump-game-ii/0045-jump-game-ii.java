class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int jump =0;
        int farthest =0 ;
        int currentpath=0;

        for(int i=0;i<n-1;i++){
            int max = i+nums[i];

            farthest = Math.max(farthest,max);

            if(i==currentpath){
                jump++;
                currentpath=farthest;
            }
        }
        return jump;
    }
}