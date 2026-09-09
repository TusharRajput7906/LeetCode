class Solution {
    public long countCommas(long n) {
       long total=0;
       long check=1000;
       while(n>=check){
        total+=n-check+1;
        check*=1000;
       }
       return total;
    }
}