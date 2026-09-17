class Solution {
    public int numberOfAlternatingGroups(int[] arr) {
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(i==0 && arr[i+1]==arr[n-1] && arr[i+1]!=arr[i]){
                count++;
            }else if(i==n-1 && arr[i-1]==arr[0] && arr[i]!=arr[0]){
                count++;
            }else if(i!=0 && i!=n-1 && arr[i-1]==arr[i+1] && arr[i-1]!=arr[i]){
                count++;
            }
        }
        return count;
    }
}