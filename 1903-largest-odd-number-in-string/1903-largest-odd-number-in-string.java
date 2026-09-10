class Solution {
    // public long find(String num){
    //     long val=Long.parseLong(num);
    //     return val%2!=0?val:0;
    // }
    public String largestOddNumber(String num) {
        int n=num.length();
        long max=0;
        for(int i=n-1;i>=0;i--){
            int val=num.charAt(i)-'0';
            if(val%2!=0){
                return num.substring(0,i+1);
            }
        }
        return "";
        // for(int i=0;i<n;i++){
            
        //     for(int j=i+1;j<=n;j++){
        //        long odd= find(num.substring(i,j));
        //        max=Math.max(odd,max);
        //     }
        // }
        // return max==0?"":Long.toString(max);
    }
}