class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        int n = s.length();
        HashMap<String, String> map = new HashMap<>();

        for (List<String> pair : knowledge) {
            map.put(pair.get(0), pair.get(1));
        }
        StringBuilder str = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                flag = true;
                continue;
            } else if (ch == ')') {
                flag = false;
                String key = str.toString();

                if (map.containsKey(key)) {
                    ans.append(map.get(key));
                } else {
                    ans.append('?');
                }

                str.setLength(0);
                continue;
            } else {
                if (flag == true) {
                    str.append(ch);
                } else {
                    ans.append(ch);
                }
            }
        }
        return ans.toString();
    }
}