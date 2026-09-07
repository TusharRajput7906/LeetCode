class Solution {
    public int dominantIndex(int[] nums) {
        int max=-1;
        int idx=-1;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
                idx=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(max==nums[i]) continue;
            if(nums[i]*2>max) return -1;
        }
        return idx;
    }
}