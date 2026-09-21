class Solution {
    public int[] diStringMatch(String s) {
        int n=s.length();
        int[] arr=new int[n+1];
        int low=0;
        int high=n;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='I'){
                arr[i]=low++;
            }else{
                arr[i]=high--;
            }
        }
        arr[n]=low;
        return arr;
    }
}