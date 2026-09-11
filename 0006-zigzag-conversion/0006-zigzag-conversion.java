class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        List<List<Character>> answer=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            answer.add(new ArrayList<>());
        }
        int rows=0;
        int turn=0;
        for(int i=0;i<s.length();i++){
            answer.get(rows).add(s.charAt(i));
            if(turn==0){
                rows++;
                if(rows==numRows){
                    rows-=2;
                    turn=1;
                }
            }else{
                rows--;
                if(rows==-1){
                    rows+=2;
                    turn=0;
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<numRows;i++){
            for(int j=0;j<answer.get(i).size();j++){
                sb.append(answer.get(i).get(j));
            }
        }
        return sb.toString();
    }
}