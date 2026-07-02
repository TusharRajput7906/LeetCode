class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
            if(h.get(nums[i])>nums.length/3){
                if(!l.contains(nums[i])){
                    l.add(nums[i]);
                }
            }
        }
        return l;
    }
}