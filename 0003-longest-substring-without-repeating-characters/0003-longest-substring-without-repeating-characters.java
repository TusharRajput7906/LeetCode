class Solution {
    public int lengthOfLongestSubstring(String s) {
        // HashSet<Character> h=new HashSet<>();
        // int max=0;
        // int j=0;
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     while(h.contains(ch)){
        //         h.remove(s.charAt(j));
        //         j++;
        //     }
        //     h.add(ch);
        //     max=Math.max(i-j+1,max);
        // }
        // return max;
        int len=s.length();
        int[] fre=new int[128];
        int max=0;
        int left=0;
        for(int right=0;right<len;right++){
            char ch=s.charAt(right);
            left=Math.max(left,fre[ch]);
            fre[ch]=right+1;
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}