class Solution {
    public boolean repeatedSubstringPattern(String s) {
       String dbl=s+s;
       return dbl.substring(1,dbl.length()-1).contains(s);
    }
}