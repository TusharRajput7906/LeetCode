class Solution {
    public int numIdenticalPairs(int[] nums) {
        // int n=nums.length;
        // int ans=0;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]==nums[j]){
        //             ans++;
        //         }
        //     }
        // }
        // return ans;
        HashMap<Integer,Integer> h=new HashMap<>();
        int ans=0;
        for(int num:nums){
            if(h.containsKey(num)){
                ans+=h.get(num);
            }
            h.put(num,h.getOrDefault(num,0)+1);
        }
        return ans;
    }
}