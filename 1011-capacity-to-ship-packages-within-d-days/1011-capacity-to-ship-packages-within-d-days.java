class Solution {
    public boolean Days(int[] arr, int days,int mid){
        int sum=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>mid){
                count++;
                sum=arr[i];
            }else if(sum==mid){
                count++;
                sum=0;
            }
        }
        if(sum!=0){
            count++;
        }
        if(count<=days){
            return true;
        }
        return false;
    }
    public int sum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public int max(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }
    public int shipWithinDays(int[] arr, int days) {
        int low=max(arr);
        int high=sum(arr);
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(Days(arr,days,mid)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}