class Solution {
     public int gfd(int a,int b){
            return b==0?a:gfd(b,a%b);
        }
    public int findGCD(int[] nums) {
        int ans=0;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
            if (min > nums[i]) {
                min = nums[i];
            }
            if(i==n-1){
               ans= gfd(max,min);
            }
        }
        return ans;
    }
}