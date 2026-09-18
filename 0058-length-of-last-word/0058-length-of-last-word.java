class Solution {
    public int lengthOfLastWord(String s) {
        int len=s.length();
        int i=len-1;
        while(i>=0 && s.charAt(i)==' '){
            i--;
        }
        int count=0;
        while(i>=0 && s.charAt(i)!=' '){
            count++;
            i--;
        }
        return count;
        // String[] str= s.split(" ");
        // for(int i=str.length-1;i>=0;i--){
        //     if(str[i]!=" ") return str[i].length();
        // }
        // return -1;
    }
}