class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> list=new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)->map.get(b)-map.get(a));
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}





