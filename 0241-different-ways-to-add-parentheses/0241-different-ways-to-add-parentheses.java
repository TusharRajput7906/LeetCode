class Solution {
    public List<Integer> diffWaysToCompute(String exp) {
        List<Integer> li=new ArrayList<>();
        int n=exp.length();
        for(int i=0;i<n;i++){
            char ch=exp.charAt(i);
            if(ch=='+'||ch=='-'||ch=='*'){
                String leftStr=exp.substring(0,i);
                String rightStr=exp.substring(i+1);

                List<Integer> left=diffWaysToCompute(leftStr);
                List<Integer> right=diffWaysToCompute(rightStr);

                for(int l:left){
                    for(int r:right){
                        if(ch=='+'){
                            li.add(l+r);
                        }else if(ch=='-'){
                            li.add(l-r);
                        }else{
                            li.add(l*r);
                        }
                    }
                }
            }
        }
        if(li.isEmpty()){
            li.add(Integer.parseInt(exp));
        }
        return li;
    }
}