class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        Set<Integer> st=new HashSet<>();
        for(int i=0;i<n;i++){
            if(st.contains(nums[i])){
                return true;
            }
            st.add(nums[i]);
            if(i>=k){
                st.remove(nums[i-k]);
            }
        }
        return false;
    }
}