class Solution {
    public int missingMultiple(int[] nums, int k) {
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            l.add(nums[i]);
        }
        int val=k;
        while(!l.isEmpty()){
            if(l.contains(val)){
                val+=k;
            }else{
                return val;
            }
        }
        return 2;
    }
}