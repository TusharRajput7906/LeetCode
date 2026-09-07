class Solution {
    public int numRescueBoats(int[] arr, int limit) {

        Arrays.sort(arr);

        int i = 0;
        int j = arr.length - 1;
        int boats = 0;

        while (i <= j) {

            if (arr[i] + arr[j] <= limit) {
                i++;
            }

            j--;
            boats++;
        }

        return boats;
    }
}

// class Solution {
//     public int numRescueBoats(int[] arr, int limit) {
//         int m=arr.length;
//         Arrays.sort(arr);
//         int i=0;
//         int j=m-1;
//         int c=0;
//         while(i<=j){
//             int n=limit-arr[j];
//             if(n>0){
//                 if(n>=arr[i]){
//                     i++;j--;c++;
//                 }else{
//                     j--;c++;
//                 }
//             }else{
//                 j--;c++;
//             }
//         }
//         return c;
//     }
// }