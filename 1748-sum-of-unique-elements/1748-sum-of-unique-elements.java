class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        int sum=0;
        for(int val:h.keySet()){
            if(h.get(val)==1){
                sum+=val;
            }
        }
        return sum;
    }
}