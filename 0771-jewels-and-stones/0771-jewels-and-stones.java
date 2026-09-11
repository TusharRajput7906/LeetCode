class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        List<Character> li=new ArrayList<>();
        for(int i=0;i<jewels.length();i++){
            char ch=jewels.charAt(i);
            li.add(ch);
        }
        int ans=0;
        for(int i=0;i<stones.length();i++){
            char ch=stones.charAt(i);
            if(li.contains(ch)){
                ans++;
            }
        }
        return ans;
    }
}