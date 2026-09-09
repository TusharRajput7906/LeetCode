class Solution {
    public int minimumSum(int num) {
        
        String str=Integer.toString(num);
        // int min=Integer.MAX_VALUE;
        // int SecMin=Integer.MAX_VALUE;
        int[] arr=new int[str.length()];
        for(int i=0;i<str.length();i++){
           int n=str.charAt(i)-'0';
           arr[i]=n;
        }
        Arrays.sort(arr);
        int val=(arr[0]*10+arr[2]);
        int val1=(arr[1]*10+arr[3]);
        return (val+val1);
    }
}