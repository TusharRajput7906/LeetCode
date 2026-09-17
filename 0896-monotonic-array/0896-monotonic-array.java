class Solution {
    public boolean isMonotonic(int[] nums) {
        int i=0,j=1;
        int n=nums.length;
        boolean inc=true;
        boolean dec=true;
        while(j<n){
            if(!(nums[i]<=nums[j])){
                inc=false;
            }else if(!(nums[i]>=nums[j])){
                dec=false;
            }
            j++;i++;
        }
        // i=0;
        // j=1;
        // while(j<n){
        //     if(!(nums[i]>=nums[j])){
        //         dec=false;
        //     }
        //     j++;i++;
        // }
        if(inc || dec){
            return true;
        }
        return false;
    }
}