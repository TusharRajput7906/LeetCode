class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int left=0;
        int max=0;
        int leftElm=0;
        for(int i=0;i<fruits.length;i++){
            h.put(fruits[i],h.getOrDefault(fruits[i],0)+1);
            if(h.size()>2){
                leftElm=fruits[left];
                h.put(leftElm,h.get(leftElm)-1);
                if(h.get(leftElm)==0){
                    h.remove(leftElm);
                }
                left++;
            }
            max=Math.max(max,i-left+1);
        }
    return max;
    }
}

// class Solution {

//     public int totalFruit(int[] fruits) {

//         int n = fruits.length;

//         if (n <= 2) return n;

//         int first = fruits[0];
//         int sec = 0, k = 1;

//         if (fruits[1] != fruits[0]) {
//             sec = fruits[1];
//         } else {
//             while (k < n && fruits[k] == fruits[k - 1]) {
//                 k++;
//             }

//             if (k == n) return n;

//             sec = fruits[k];
//         }

//         int j = 0;
//         int max = Integer.MIN_VALUE;

//         for (int i = k + 1; i < n; i++) {

//             if (fruits[i] != first && fruits[i] != sec) {

//                 max = Math.max(max, i - j);

//                 int s = i - 1;

//                 while (s > j && fruits[s] == fruits[s - 1]) {
//                     s--;
//                 }

//                 j = s;

//                 first = sec;
//                 sec = fruits[i];
//             }

//             max = Math.max(max, i - j + 1);
//         }

//         return max;
//     }
// }