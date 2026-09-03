class Solution {
    public boolean canAliceWin(int[] nums) {
        int single=0;
        int doub=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<10){
                single+=nums[i];
            }else{
                doub+=nums[i];
            }
        }
        return single!=doub;
    }
}