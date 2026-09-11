class Solution {
    public int find(String s,HashSet<Character> h) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (h.contains(s.charAt(i))) {
                return 1;
            }
        }
        return 0;

    }

    public int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character> h = new HashSet<>();
        for (int i = 0; i < brokenLetters.length(); i++) {
            h.add(brokenLetters.charAt(i));
        }
        int ans = 0;
        String[] arr = text.split(" ");
        for (int i = 0; i < arr.length; i++) {
            ans+=find(arr[i],h);
        }
        return arr.length-ans;

    }
}