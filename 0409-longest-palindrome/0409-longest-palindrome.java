class Solution {
    public int longestPalindrome(String s) {
        int[] arr=new int[128];
        for(char ch:s.toCharArray()){
            arr[ch]++;
        }
        int len=0;
        boolean odd=false;
        for(int i=0;i<128;i++){
            if(arr[i]%2==1){
                odd=true;
            }
            len+=(arr[i]/2)*2;
        }
        if(odd){
            len+=1;
        }
        return len;
    }
}