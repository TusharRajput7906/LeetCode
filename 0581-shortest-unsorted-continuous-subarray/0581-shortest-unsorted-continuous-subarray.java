class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n=nums.length;
        int left=-1;
        int right=-1;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            if(nums[i]<max){
                right=i;
            }
        }
        for(int i=n-1;i>=0;i--){
            min=Math.min(min,nums[i]);
            if(nums[i]>min){
                left=i;
            }
        }
        if(left==-1) return 0;
        return right-left+1;
    }
}