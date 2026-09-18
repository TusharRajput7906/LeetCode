class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int m=k;
            int j=i;
            while(j<n){
                if(j<n && nums[j]==1){
                    j++;
                }else if(m>0 && nums[j]==0){
                    j++;m--;
                }else{
                    break;
                }
            }
            max=Math.max(max,j-i);
        }
        return max;
    }
}