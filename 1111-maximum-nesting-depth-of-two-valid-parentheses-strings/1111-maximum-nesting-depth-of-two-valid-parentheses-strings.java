class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n=seq.length();
        int[] arr=new int[n];
        int depth=0;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=seq.charAt(i);
            if(ch=='('){
                depth++;
                arr[i]=depth%2;
            }else{
                arr[i]=depth%2;
                depth--;
            }
        }
        return arr;
    }
}