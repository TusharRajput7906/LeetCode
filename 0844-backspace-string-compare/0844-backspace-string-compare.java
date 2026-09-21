class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '#') {
                if (st.size() > 0) {
                    st.pop();
                }
            } else {
                st.push(ch);
            }
        }
        Stack<Character> st1 = new Stack<>();
        int m = t.length();
        for (int i = 0; i < m; i++) {
            char ch = t.charAt(i);
            if (ch == '#') {
                if (st1.size() > 0) {
                    st1.pop();
                }
            } else {
                st1.push(ch);
            }
        }
        if (st1.size() != st.size())
            return false;
        while (!st1.empty()) {
            if (st1.peek() != st.peek())
                return false;
            st.pop();
            st1.pop();
        }
        return true;
    }
}