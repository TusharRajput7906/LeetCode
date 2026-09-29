class Solution {
    public void solve(int open, int close,int n, String str,List<String> ans){
        if(open==n && close==n){
            ans.add(str);
            return;
        }
        if(open<n){
            solve(open+1,close,n,str+"(",ans);
        }
        if(close<open){
            solve(open,close+1,n,str+")",ans);
        }

    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        solve(0,0,n,"",ans);;
        return ans;
    }
}