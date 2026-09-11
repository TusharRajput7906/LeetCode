class Solution {
    public void find(List<String> list,HashSet<String> h){
            h.add(list.get(0));
    }
    public String dest(List<String> list,HashSet<String> h){
        if(!h.contains(list.get(1))){
            return list.get(1);
        }
        return "";
    }
    public String destCity(List<List<String>> paths) {
        int n=paths.size();
        HashSet<String> h=new HashSet<>();
        for(int i=0;i<n;i++){
            find(paths.get(i),h);
        }
        for(int i=0;i<n;i++){
          String str= dest(paths.get(i),h);
          if(!str.equals("")){
            return str;
          }
        }
        return "";
    }
}