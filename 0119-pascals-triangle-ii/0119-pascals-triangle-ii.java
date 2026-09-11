class Solution {
    public List<Integer>  getRow(int rowIndex) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        answer.add(firstRow);

        int middleElement = 0;
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);

            for (int j = 1; j <= middleElement; j++) {
                int element = answer.get(i - 1).get(j) + answer.get(i - 1).get(j - 1);
                currentRow.add(element);
            }
            currentRow.add(1);

            answer.add(currentRow);
            middleElement++;
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<answer.get(answer.size()-1).size();i++){
            list.add(answer.get(answer.size()-1).get(i));
        }
        return list;
    }
}