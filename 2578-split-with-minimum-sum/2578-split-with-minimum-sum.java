class Solution {
    public int splitNum(int num) {
        String str=Integer.toString(num);
        int[] arr=new int[str.length()];
        for(int i=0;i<str.length();i++){
            arr[i]=str.charAt(i)-'0';
        }
        Arrays.sort(arr);
        int val=0;
        int n=str.length();
        // int m=0;
        // if(n%2==0){
        //     j=n/2;
        //     m=n/2;
        // }else{
        //     j=n/2+1;
        //     m=n/2+1;
        // }
        int i=0,k=0;
        while(i<n){
           val=val*10+arr[i];
           i+=2;
        }
        int val2=0;
        int x=1;
        while(x<n){
         val2=val2*10+arr[x];
         x+=2;
        }
        return val+val2;
    }
}