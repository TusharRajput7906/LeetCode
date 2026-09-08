class Solution {
    public boolean checkIfPangram(String s) {
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<26;i++){
            char ch=(char)(97+i);
            h.put(ch,1);
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(h.containsKey(ch)){
                h.put(ch,h.get(ch)+1);
            }
        }
        for(int i=0;i<26;i++){
            char ch=(char)(97+i);
            if(h.get(ch)<=1) return false;
        }
        return true;

    }
}