class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        List<List<Character>> li=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            li.add(new ArrayList<>());
        }

        int row=0;
        int turn=0;
        for(int i=0;i<s.length();i++){
            li.get(row).add(s.charAt(i));
            if(turn==0){
                row++;
                if(row==numRows){
                    row-=2;
                    turn=1;
                }
            }else{
                row--;
                if(row==-1){
                    row+=2;
                    turn=0;
                }
            }
        }
        StringBuilder str=new StringBuilder();
        for(int i=0;i<li.size();i++){
            for(int j=0;j<li.get(i).size();j++){
                str.append(li.get(i).get(j));
            }
        }
        return str.toString();
    }
}