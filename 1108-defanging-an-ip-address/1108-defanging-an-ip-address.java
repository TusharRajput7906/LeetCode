class Solution {
    public String defangIPaddr(String address) {
        // StringBuilder str=new StringBuilder();
        // for(int i=0;i<address.length();i++){
        //     char ch=address.charAt(i);
        //     if(ch!='.'){
        //         str.append(ch);
        //     }else{
        //         str.append('[');
        //         str.append(ch);
        //         str.append(']');
        //     }
        // }
        // return str.toString();
        return address.replace(".","[.]");
    }
}