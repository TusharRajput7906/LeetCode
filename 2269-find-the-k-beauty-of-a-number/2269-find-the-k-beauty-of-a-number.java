class Solution {
    public int divide(String str,int num){
        int n=Integer.parseInt(str);
        if(n>0 && num%n==0) return 1;
        return 0;
    }
    public int divisorSubstrings(int num, int k) {
        // int m=num;
        String str=Integer.toString(num);
        int ans=0;
        for(int i=0;i<=str.length()-k;i++){
            ans+=divide(str.substring(i,k+i),num);
        }
        return ans;
        
    }
}