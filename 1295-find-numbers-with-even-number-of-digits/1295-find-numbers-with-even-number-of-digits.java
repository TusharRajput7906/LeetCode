class Solution {
    public int findNumbers(int[] nums) {
        int ans=0;
        for(int num:nums){
            int dig=0;
            while(num>0){
                num/=10;
                dig++;
            }
            if(dig%2==0) ans++;
        }
        return ans;
    }
}