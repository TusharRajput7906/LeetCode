class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int zeroes=0;
        int length=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0){
                zeroes++;
            }
            while(zeroes>k){
                if(nums[left]==0){
                    zeroes--;
                }
                left++;
            }
            length=Math.max(length,right-left+1);
        }
        return length;
    }
}

// class Solution {
//     public int longestOnes(int[] nums, int k) {
//         int n=nums.length;
//         int max=Integer.MIN_VALUE;
//         for(int i=0;i<n;i++){
//             int m=k;
//             int j=i;
//             while(j<n){
//                 if(j<n && nums[j]==1){
//                     j++;
//                 }else if(m>0 && nums[j]==0){
//                     j++;m--;
//                 }else{
//                     break;
//                 }
//             }
//             max=Math.max(max,j-i);
//         }
//         return max;
//     }
// }