class Solution {
    public boolean vowel(char ch) {
        // int i=0,j=str.length()-1;
        // if((str.charAt(i)=='a' &&( str.charAt(j)=='a'||str.charAt(j)=='e'||str.charAt(j)=='i'||str.charAt(j)=='o'||str.charAt(j)=='u'))
        // ||
        // (str.charAt(i)=='e' && (str.charAt(j)=='a'||str.charAt(j)=='e'||str.charAt(j)=='i'||str.charAt(j)=='o'||str.charAt(j)=='u'))
        // ||
        // (str.charAt(i)=='i' && (str.charAt(j)=='a'||str.charAt(j)=='e'||str.charAt(j)=='i'||str.charAt(j)=='o'||str.charAt(j)=='u'))
        // ||
        // (str.charAt(i)=='o' && (str.charAt(j)=='a'||str.charAt(j)=='e'||str.charAt(j)=='i'||str.charAt(j)=='o'||str.charAt(j)=='u'))
        // ||
        // (str.charAt(i)=='u' && (str.charAt(j)=='a'||str.charAt(j)=='e'||str.charAt(j)=='i'||str.charAt(j)=='o'||str.charAt(j)=='u'))
        // ){
        //     return true;

        // }
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public int vowelStrings(String[] words, int left, int right) {
        int ans = 0;
        for (int i = left; i <= right; i++) {
            String str = words[i];
            int len = str.length();
            char first = str.charAt(0);
            char sec = str.charAt(len - 1);
            if (vowel(first) && vowel(sec)) {
                ans++;
            }
        }
        return ans;
    }
}