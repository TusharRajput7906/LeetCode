class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        PriorityQueue<Integer> p=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            p.add(nums[i]);
        }
        int i=0;
        int m=n/2;
        while(i<m){
            p.remove();
            i++;
        }
        return p.remove();
    }
}