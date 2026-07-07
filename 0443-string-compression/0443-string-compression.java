class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        StringBuilder s=new StringBuilder();
            int sum=1;
        for(int i=1;i<n;i++){
            if(chars[i-1]==chars[i]){
                sum++;
            }else{
                s.append(chars[i-1]);
                if(sum>1){
                s.append(sum);
                }
                sum=1;
            }
        }
            s.append(chars[n-1]);
        if(sum>1){
            s.append(sum);
        }
        String ans = s.toString();

for (int i = 0; i < ans.length(); i++) {
    chars[i] = ans.charAt(i);
}

return ans.length();
    }
}