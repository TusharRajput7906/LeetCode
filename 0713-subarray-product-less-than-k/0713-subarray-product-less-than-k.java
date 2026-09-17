class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int n = nums.length;
        int count = 0;
        int left=0;
        int prod=1;
        for(int right=0;right<n;right++){
            prod*=nums[right];
            while(prod>=k && left<n){
                prod/=nums[left];
                left++;
            }
            count+=(right-left+1);
        }
        return count;
        // for (int i = 0; i < n; i++) {
        //     int prod = nums[i];
        //     if (prod < k) {
        //         count++;
        //     } else {
        //         continue;
        //     }
        //     int j = i + 1;
        //     while (j < n) {
        //         prod *= nums[j];
        //         if (prod < k) {
        //             count++;
        //         } else {
        //             break;
        //         }
        //         j++;
        //     }
        // }
        // return count;
    }
}