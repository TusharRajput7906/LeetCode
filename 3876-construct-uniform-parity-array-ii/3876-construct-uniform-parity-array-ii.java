class Solution {
    public boolean odd(int[] arr){
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                flag=true;
            }else if(flag){
                // if(i>0){
                //     arr[i]-arr[i-1]{

                //     }
                // }
                continue;
            }else if(!flag){
                return false;
            }
        }
        return true;
    }
    public boolean even(int[] arr){
        for(int i=0;i<arr.length;i++){
           if(arr[i]%2!=0){
                return false;
           }
        }
        return true;
    }
    public boolean uniformArray(int[] nums1) {
        Arrays.sort(nums1);
       return odd(nums1) || even(nums1);
    }
}