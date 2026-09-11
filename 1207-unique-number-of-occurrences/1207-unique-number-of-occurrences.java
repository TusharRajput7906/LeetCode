class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> h=new HashMap<>();
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);
        }
        for(int val : h.values()){
            if(s.contains(val)){
                return false;
            }
            s.add(val);
        }
        return true;
    }
}