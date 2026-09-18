// class Solution {
//     public int numJewelsInStones(String jewels, String stones) {
//         List<Character> li=new ArrayList<>();
//         for(int i=0;i<jewels.length();i++){
//             char ch=jewels.charAt(i);
//             li.add(ch);
//         }
//         int ans=0;
//         for(int i=0;i<stones.length();i++){
//             char ch=stones.charAt(i);
//             if(li.contains(ch)){
//                 ans++;
//             }
//         }
//         return ans;
//     }
// }
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int[] arr = new int[128];
        int count = 0;
        for(int i : jewels.toCharArray()){
            arr[i] = 1;
        }
        for(int j : stones.toCharArray()){
            if(arr[j]==1){
                count++;
            }
        }
        return count;
    }
}