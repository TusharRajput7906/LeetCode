class Solution {
    public int count(List<String> li,String ruleKey,String ruleValue){
        if(ruleKey.equals("type") && ruleValue.equals(li.get(0))) return 1;
        else if(ruleKey.equals("color") && ruleValue.equals(li.get(1))) return 1;
        else if(ruleKey.equals("name") && ruleValue.equals(li.get(2))) return 1;
        return 0;
    }
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int n=items.size();
        int ans=0;
        for(int i=0;i<n;i++){
            ans=ans+count(items.get(i),ruleKey,ruleValue);
        }
        return ans;
    }
}