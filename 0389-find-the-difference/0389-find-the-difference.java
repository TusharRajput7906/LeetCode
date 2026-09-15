class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            h.put(ch,h.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            h.put(ch,h.getOrDefault(ch,0)-1);
        }
        for(char key:h.keySet()){
            if(h.get(key)==1){
                return key;
            }
        }
        return 'a';
        // int[] arr=new int[26];
        // for(int i=0;i<t.length();i++){
        //     int idx=t.charAt(i)-'a';
        //     arr[idx]++;
        // }
        // for(int i=0;i<s.length();i++){
        //     int idx=s.charAt(i)-'a';
        //     arr[idx]--;
        // }
        // for(int i=0;i<26;i++){
        //     if(arr[i]==1){
        //         return (char)(i+97);
        //     }
        // }
        // return 'a';
    }
}