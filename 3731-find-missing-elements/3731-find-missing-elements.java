class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i+1<nums.length;i++){
            int diff = nums[i+1]-nums[i];

            while(--diff>0){
                ans.add(nums[i]+diff);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}