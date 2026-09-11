class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int m=n;
        while(n>0){
            int num=0;
            while(n>0){
                int rem=n%10;
                num+=rem;
                n/=10;
            }
            h.put(num,h.getOrDefault(num,0)+1);
            m--;
            n=m;
        }
        int max=0;
        for(int val:h.values()){
            max=Math.max(max,val);
        }
        int ans=0;
        for(int val:h.keySet()){
            if(h.get(val)==max){
                ans++;
            }
        }
        return ans;
    }
}