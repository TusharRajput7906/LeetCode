class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        Arrays.sort(nums);
        int count=0;
        int max=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]==nums[i-1]+1){
                count++;
            }else{
                max=Math.max(count,max);
                count=0;
            }
                max=Math.max(count,max);
        }
        return max+1;
    }
}