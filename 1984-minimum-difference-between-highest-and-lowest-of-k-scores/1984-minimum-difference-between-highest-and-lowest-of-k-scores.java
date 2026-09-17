class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(nums.length==1) return 0;
        Arrays.sort(nums);
        int n=nums.length-k;
        int i=0;
        int min=Integer.MAX_VALUE;
        while(i<=n){
            min=Math.min(min,nums[k-1]-nums[i]);
            i++;k++;
        }
        return min;
    }
}