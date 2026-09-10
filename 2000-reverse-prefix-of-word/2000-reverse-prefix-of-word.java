class Solution {
    public void reverse(char[] arr,int i,int j){
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public String reversePrefix(String word, char ch) {
        int n=word.length();
        char[] arr=word.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ch){
                reverse(arr,0,i);
                break;
            }
        }
        word="";
        for(int i=0;i<arr.length;i++){
            word+=arr[i];
        }
        return word;
    }
}