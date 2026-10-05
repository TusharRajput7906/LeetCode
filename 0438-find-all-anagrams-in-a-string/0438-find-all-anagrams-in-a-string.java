class Solution {
    public boolean anagram(String sub, HashMap<Character, Integer> h) {
        HashMap<Character, Integer> h1 = new HashMap<>();
        for (int i = 0; i < sub.length(); i++) {
            char ch = sub.charAt(i);
            h1.put(ch, h1.getOrDefault(ch, 0) + 1);
        }
        return h.equals(h1);
    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> li = new ArrayList<>();
        HashMap<Character, Integer> h = new HashMap<>();
        int n = p.length();
        for (int i = 0; i < n; i++) {
            char ch = p.charAt(i);
            h.put(ch, h.getOrDefault(ch, 0) + 1);
        }
        int m = s.length() - n + 1;
        int i = 0;
        boolean flag = false;
        while (i < m) {
            flag = anagram(s.substring(i, i + n), h);
            if (flag) {
                li.add(i);
                i++;
                while (i < m && s.charAt(i - 1) == s.charAt(i + n - 1)) {
                    li.add(i);
                    i++;
                }
                i++;
                flag = false;
            } else {
                i++;
            }
        }
        return li;
    }
}