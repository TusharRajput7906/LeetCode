class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> h=new HashMap<>();
        h.put(0,1);
        int n=nums.length;
        int ans=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int rem= ((sum % k) + k) % k;
            ans+=h.getOrDefault(rem,0);
            h.put(rem,h.getOrDefault(rem,0)+1);
        }
        return ans;
    }
}