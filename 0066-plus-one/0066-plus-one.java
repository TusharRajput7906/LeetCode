class Solution {
    public int[] plusOne(int[] arr) {
        int n = arr.length;
        if (arr[n - 1] <= 8) {
            arr[n - 1] += 1;
            return arr;
        }
        ArrayList<Integer> l = new ArrayList<>();
        int carry = 0;
        for (int i = n - 1; i >= 0; i--) {
            int val = carry + arr[i];
             if(i==n-1){
                val +=1;
            }
            if (arr[i] < 9) {
                arr[i] += carry;
                l.add(arr[i]);
                carry=val/10;
            }else{
                int a = val % 10;
            l.add(a);
            carry = val / 10;
            }  
        }
        if (carry > 0) {
            l.add(carry);
        }
        Collections.reverse(l);

        int[] ans = new int[l.size()];
        for (int i = 0; i < l.size(); i++) {
            ans[i] = l.get(i);
        }
        return ans;
    }
}