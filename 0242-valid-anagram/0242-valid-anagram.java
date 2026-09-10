class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            h.put(ch,h.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(h.containsKey(ch)){
                h.put(ch,h.get(ch)-1);
                if(h.get(ch)<=0){
                    h.remove(ch);
                }
            }else{
                return false;
            }
        }
        return true;
    }
}