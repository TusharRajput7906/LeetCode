class Solution {
    public int splitNum(int num) {
        String str=Integer.toString(num);
        int[] arr=new int[str.length()];
        for(int i=0;i<str.length();i++){
            arr[i]=str.charAt(i)-'0';
        }
        Arrays.sort(arr);
        int val=0,val1=0;
        int n=str.length();
        int i=0;
        while(i<n){
            if(i%2==0){
            val=val*10+arr[i];
            }else{
                val1=val1*10+arr[i];
            }
            i++;
        }
     return val+val1;   
    }
}