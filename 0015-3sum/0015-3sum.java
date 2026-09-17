class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> li=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int low=i+1;
            int high=n-1;
            while(low<high){
                int sum=nums[i]+nums[low]+nums[high];
                if(sum==0){
                    List<Integer> l=new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[low]);
                    l.add(nums[high]);
                    li.add(l);
                low++;high--;
                while(low<high && nums[low]==nums[low-1]){
                    low++;
                }
                while(high>low && nums[high]==nums[high+1]){
                    high--;
                }
                }else if(sum>0){
                    high--;
                }else{
                    low++;
                }
            }
        }
        return li;
    }
}
