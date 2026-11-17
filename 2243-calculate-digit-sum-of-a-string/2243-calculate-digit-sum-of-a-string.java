class Solution {
    public String sum(String s,int k){
        int n=s.length();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<n;i+=k){
            int sum=0;
            for(int j=i;j<i+k;j++){
                if(j<n){
                sum+=s.charAt(j)-'0';
                }
            }
            str.append(sum);
        }
        return str.toString();
    }
    public String digitSum(String s, int k) {
        int n=s.length();
        while(n>k){
            s=sum(s,k);
            n=s.length();
        }
        return s;
    }
}