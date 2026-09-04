class Solution {
    public void max(int[] nums,int[] max){
        int m=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            m=Math.max(m,nums[i]);
            max[i]=m;
        }
    }
    public void min(int[] nums,int[] min){
        int n=nums.length;
        int m=Integer.MAX_VALUE;
        for(int i=n-1;i>=0;i--){
            m=Math.min(m,nums[i]);
            min[i]=m;
        }
    }
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] min=new int[n];
        int[] max=new int[n];
        max(nums,max);
        min(nums,min);
        boolean flag=false;
        for(int i=0;i<nums.length;i++){
            int val=max[i]-min[i];
            if(val<=k) return i;
        }
        return -1;
    }
}