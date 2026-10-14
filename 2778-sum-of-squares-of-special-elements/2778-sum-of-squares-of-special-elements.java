class Solution {
    public int sumOfSquares(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(n%(i+1)==0){
                sum=sum+(nums[i]*nums[i]);
            }
        }
        return sum;
    }
}