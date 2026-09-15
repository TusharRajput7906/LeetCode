class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        int dup=0;
        int mis=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==0){
                mis=i;
            }
            if(arr[i]>1){
                dup=i;
            }
        }
        return new int[]{dup,mis};
    }
}