class Solution {
    public int longestMountain(int[] arr) {
        int i=1;
        int n=arr.length-1;
        int ans=0;
        while(i<n){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                    int left=i;
                while(left>0 && arr[left]>arr[left-1]){
                    left--;
                }
                int right=i;
                while(right<n && arr[right]>arr[right+1]){
                    right++;
                }
                ans=Math.max(ans,right-left+1);
                 i=right;
            }else{
                i++;
            }
        }
        return ans;
    }
}