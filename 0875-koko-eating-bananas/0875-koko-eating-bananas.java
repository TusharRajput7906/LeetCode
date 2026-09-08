class Solution {
    public boolean rev(int[] arr,int mid,int h){
        long ans=0;
            for (int i = 0; i < arr.length; i++) {
           if(arr[i]%mid==0){
                ans+=(arr[i]/mid);
            }else{
                ans+=(arr[i]/mid)+1;
            }
        }
        if(ans<=h) return true;
        return false;
    }
    public int find(int[] arr,int h,int low,int high){
        int res=Integer.MAX_VALUE;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(rev(arr,mid,h)){
                    res=Math.min(res,mid);
                    high=mid-1;
                }else{
                    low=mid+1;
                
            }
            }
            return res;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=-1;
        for(int n:piles){
            high=Math.max(high,n);
        }
        return find(piles,h,low,high);
    }
}