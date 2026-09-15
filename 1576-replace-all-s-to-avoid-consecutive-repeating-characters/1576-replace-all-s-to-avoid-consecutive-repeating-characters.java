class Solution {
    public String modifyString(String s) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {

            if (sb.charAt(i) == '?') {

                for (char ch = 'a'; ch <= 'z'; ch++) {

                    if (i > 0 && sb.charAt(i - 1) == ch) {
                        continue;
                    }

                    if (i < sb.length() - 1 && sb.charAt(i + 1) == ch) {
                        continue;
                    }

                    sb.setCharAt(i, ch);
                    break;
                }
            }
        }

        return sb.toString();
    }
}