class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str=new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if((ch>='a' && ch<='z') ||(ch>='A' && ch<='Z' ||(ch>='0' && ch<='9'))){
                str.append(ch);
            }
        }
        s=str.toString().toLowerCase();
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }
}