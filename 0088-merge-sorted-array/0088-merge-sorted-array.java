class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m=m-1;
        n=n-1;
        int a=nums1.length;
        while(n>=0 && m>=0){
            if(nums1[m]>nums2[n]){
                nums1[a-1]=nums1[m];
                a--;
                m--;
            }else{
                nums1[a-1]=nums2[n];
                a--;
                n--;
            }
        }
        while(n>=0){
            nums1[a-1]=nums2[n];
            a--;
            n--;
        }
    }
}