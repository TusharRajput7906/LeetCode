class Solution {
    public boolean pal(String str){
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)) return false;
            i++;j--;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(int i= 0;i<words.length;i++){
            if(pal(words[i])){
                return words[i];
            }
        }
        return "";
    }
}