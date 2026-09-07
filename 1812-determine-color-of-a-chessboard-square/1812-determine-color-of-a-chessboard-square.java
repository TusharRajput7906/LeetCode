class Solution {
    public boolean squareIsWhite(String s) {
        if(s.equals("a1") || s.equals("a3") || s.equals("a5") || s.equals("a7") ||
           s.equals("b2") || s.equals("b4") || s.equals("b6") || s.equals("b8") ||
           s.equals("c1") || s.equals("c3") || s.equals("c5") || s.equals("c7") ||
           s.equals("d2") || s.equals("d4") || s.equals("d6") || s.equals("d8") ||
           s.equals("e1") || s.equals("e3") || s.equals("e5") || s.equals("e7") ||
           s.equals("f2") || s.equals("f4") || s.equals("f6") || s.equals("f8") ||
           s.equals("g1") || s.equals("g3") || s.equals("g5") || s.equals("g7") ||
           s.equals("h2") || s.equals("h4") || s.equals("h6") || s.equals("h8")){
            return false;
        }
        return true;
    }
}
