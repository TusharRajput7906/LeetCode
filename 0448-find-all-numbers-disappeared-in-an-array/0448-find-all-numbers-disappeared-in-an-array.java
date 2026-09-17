class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        List<Integer> l=new ArrayList<>();
        // Set<Integer> s=new HashSet<>();
        // for(int num:nums){
        //     s.add(num);
        // }
        // for(int i=1;i<=n;i++){
        //     if(!s.contains(i)){
        //         l.add(i);
        //     }
        // }
        // return l;
        for(int i=0;i<n;i++){
            int idx=Math.abs(nums[i]);
            if(nums[idx-1]>0){
                nums[idx-1]=0-nums[idx-1];
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                l.add(i+1);
            }
        }
        return l;
    }
}