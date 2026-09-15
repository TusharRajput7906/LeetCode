class Solution {
    public char findTheDifference(String s, String t) {
        int[] arr=new int[26];
        for(int i=0;i<t.length();i++){
            int idx=t.charAt(i)-'a';
            arr[idx]++;
        }
        for(int i=0;i<s.length();i++){
            int idx=s.charAt(i)-'a';
            arr[idx]--;
        }
        for(int i=0;i<26;i++){
            if(arr[i]==1){
                return (char)(i+97);
            }
        }
        return 'a';
    }
}