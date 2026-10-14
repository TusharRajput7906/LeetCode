class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        int n=nums.length/2;
        long sum=0;
        for(int i=nums.length-1;i>=n;i--){
            sum=sum+(nums[i]*nums[i]);
        }
        for(int i=0;i<n;i++){
            sum=sum-(nums[i]*nums[i]);
        }
        return sum;
    }
}