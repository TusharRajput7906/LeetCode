class Solution {
    public int distinct(int i,int j,List<Integer> nums, HashSet<Integer> h){
        for(int k=j;k<=i;k++){
            h.add(nums.get(k));
        }
        return h.size();
    }
    public int sumCounts(List<Integer> nums) {
        HashSet<Integer> h=new HashSet<>();
        int sum=0;
        int n=nums.size();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                int val=distinct(i,j,nums,h);
                sum+=(val*val);
                h.clear();
            }
        }
        return sum;
    }
}