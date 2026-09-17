class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int[] ans=new int[n];
        if(k==0) return ans;
        for(int i=0;i<n;i++){
            int j=k;
            int sum=0;
            int l=1;
            while(j>0){
                int idx=i+l;
                idx=idx%n;
                sum+=code[idx];
                j--;l++;
            }
            while(j<0){
                int idx= (i - l + n) % n;;
                idx=idx%n;
                sum+=code[idx];
                j++;l++;
            }
            ans[i]=sum;
        }
        return ans;
    }
}