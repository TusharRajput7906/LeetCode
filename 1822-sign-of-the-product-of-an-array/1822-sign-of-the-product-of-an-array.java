class Solution {
    public int arraySign(int[] nums) {
        // long product=1;
        int neg=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) return 0;
            else if(nums[i]<0) {
                neg++;
            }
        }
        if(neg%2==0) return 1;
        return -1;
    }
}