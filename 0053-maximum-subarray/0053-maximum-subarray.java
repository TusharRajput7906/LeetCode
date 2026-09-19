class Solution {
    public int maxSubArray(int[] nums) {
        int current = nums[0];
        int max =current;
        for(int i=1;i<nums.length;i++){
            current = Math.max(nums[i],current+nums[i]);
            max= Math.max(max,current);
        }
        return max;
    }
}