class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (st.isEmpty()) {
                    return false;
                } else if ((ch == ')' && st.peek() != '(') || (ch == ']' && st.peek() != '[')
                        || (ch == '}' && st.peek() != '{')) {
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }
}
