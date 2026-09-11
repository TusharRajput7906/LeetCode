class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> h=new HashSet<>();
        while(n!=1 && !h.contains(n)){
            h.add(n);
            int ans=0;
            while(n>0){
                int rem=n%10;
                ans=ans+(rem*rem);
                n/=10;
            }
            n=ans;
        }
        if(n==1) return true;
        return false;
    }
}