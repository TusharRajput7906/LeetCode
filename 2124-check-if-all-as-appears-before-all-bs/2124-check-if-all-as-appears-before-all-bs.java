class Solution {
    public boolean checkString(String s) {
        int i=0;
        int n=s.length();
        while(i<n){
            if(s.charAt(i)=='b'){
                if(i!=n-1 && s.charAt(i+1)=='a'){
                    return false;
                }
            }
            i++;
        }
        return true;
    }
}