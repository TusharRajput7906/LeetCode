class Solution {
    public boolean palindrome(String st) {
        int i = 0, j = st.length() - 1;
        while (i < j) {
            if (st.charAt(i) != st.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        int n = s.length();
        int len = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n + 1; j++) {
                if (palindrome(s.substring(i, j))) {
                    if (len < (j-i)) {
                        len = j-i;
                        sb.setLength(0);
                        sb.append(s.substring(i, j));
                    }
                }
            }
        }
        return sb.toString();
    }
}