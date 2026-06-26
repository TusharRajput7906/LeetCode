class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> h=new HashMap<>();
        h.put(0,1);
        int n=nums.length;
        int count=0;
        int[] pref=new int[n];
        pref[0]=nums[0];
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]+nums[i];
        }
        for(int num:pref){
            if(h.containsKey(num-k)){
               count += h.get(num - k);
            }
            h.put(num,h.getOrDefault(num,0)+1);
        }
        return count;
    }
}