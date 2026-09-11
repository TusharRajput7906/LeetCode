class Solution {
    public int totalNumbers(int[] arr) {

        int[] freq = new int[10];

        for (int x : arr) {
            freq[x]++;
        }

        int ans = 0;

        // Choose unit digit
        for (int unit = 0; unit <= 8; unit += 2) {

            if (freq[unit] == 0)
                continue;

            // Use one occurrence of unit digit
            freq[unit]--;

            // Choose hundreds digit (cannot be 0)
            for (int hundred = 1; hundred <= 9; hundred++) {

                if (freq[hundred] == 0)
                    continue;

                freq[hundred]--;

                // Choose tens digit
                for (int tens = 0; tens <= 9; tens++) {

                    if (freq[tens] > 0) {
                        ans++;
                    }
                }

                freq[hundred]++;
            }

            freq[unit]++;
        }

        return ans;
    }
}

// class Solution {
//     public int totalNumbers(int[] arr) {
//         int n=arr.length;
//         boolean flag=false;
//         int even=0;
//         for(int i=0;i<n;i++){
//             if(arr[i]==0){
//                 flag=true;
//             }
//             if(arr[i]%2==0){
//                 even++;
//             }
//         }
//         int ans=0;
//         if(even==0){
//             return ans;
//         }
//         if(!flag){
//             int unit=even;
//             int hundred=arr.length-1;
//             int tens=arr.length-2;
//             ans=ans+(unit*hundred*tens);
//         }else{
//             int res=0;
//              int unit1=1;
//             int hundred1=arr.length-1;
//             int tens1=arr.length-2;
//              res=res+(unit1*hundred1*tens1);
//              int unit=even-1;
//             int hundred=arr.length-2;
//             int tens=arr.length-2;
//             ans=ans+res+(unit*hundred*tens);

//         }
//         return ans;
//     }
// }