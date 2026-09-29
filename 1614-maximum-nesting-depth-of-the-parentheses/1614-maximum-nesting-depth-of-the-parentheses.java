class Solution {
    public int maxDepth(String s) {
        int max=0;
        int count=0;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(ch);
                count++;
                max=Math.max(count,max);
            }else if(ch==')'){
                st.pop();
                count--;
                max=Math.max(count,max);
            }
        }
        return max;
    }
}