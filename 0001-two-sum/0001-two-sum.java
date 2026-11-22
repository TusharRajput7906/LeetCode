class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int val=target-nums[i];
            if(h.containsKey(val)){
                return new int[]{h.get(val),i};
            }else{
                h.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}
