class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int key=i+j;
                map.putIfAbsent(key,new ArrayList<>());
                map.get(key).add(mat[i][j]);
            }
        }
        boolean flip=true;
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<m+n-1;i++){
            List<Integer> diagonal=map.get(i);
            if(diagonal==null) continue;
            if(flip){
                Collections.reverse(diagonal);
            }
            result.addAll(diagonal);
            flip=!flip;
        }
        int[] answer=new int[result.size()];
        for(int i=0;i<result.size();i++){
            answer[i]=result.get(i);
        }
        return answer;
    }
}