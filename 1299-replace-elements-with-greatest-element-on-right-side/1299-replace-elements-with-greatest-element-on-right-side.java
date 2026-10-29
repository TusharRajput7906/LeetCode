class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int max=-1;
        for(int i=n-1;i>=0;i--){
            int val=arr[i];
            arr[i]=max;
            max=Math.max(max,val);
        }
        return arr;
    }
}