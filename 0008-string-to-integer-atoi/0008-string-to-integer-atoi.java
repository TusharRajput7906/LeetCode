class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        int n = s.length();
        if(n==0){
            return 0;
        }
        int ans = 0;
        boolean flag = false;
        char c = s.charAt(0);
        for (int i = 0; i < n; i++) {
            if (i==0 && c == '-') {
                flag = true;
                continue;
            }else if(i==0 && c=='+'){
                continue;
            }
            char ch = s.charAt(i);
             if (ch < '0' || ch > '9') {
                break;
            }
            if(ans>Integer.MAX_VALUE/10 || ans==Integer.MAX_VALUE/10 && (ch-'0')>7){
                return flag ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            ans=ans*10+(ch-'0');
        }
        return flag ? 0 - ans : ans;
    }
}