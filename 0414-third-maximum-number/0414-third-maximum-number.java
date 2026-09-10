class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        if(set.size()<3){
            for(int val:set){
                return val;
            }
        }else{
            int i=0;
            for(int val:set){
                if(i==2){
                    return val;
                }
                i++;
            }
        }
        return -1;
    }
}