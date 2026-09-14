class Solution {
    public boolean checkk(String s, HashMap<Character, Integer> h) {

    HashMap<Character, Integer> newH = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);
        newH.put(ch, newH.getOrDefault(ch, 0) + 1);
    }

    return h.equals(newH);
}

    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        HashMap<Character,Integer> h = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            h.put(ch, h.getOrDefault(ch, 0) + 1);
        }
        int j = 0;
        for (int i = s1.length(); i <= s2.length(); i++) {
            if (checkk(s2.substring(j, i),h)) {
                return true;
            }
            j++;
        }
        return false;
    }
}