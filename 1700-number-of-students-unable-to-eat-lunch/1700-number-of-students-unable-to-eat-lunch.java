class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        int n = students.length;
        for (int i = 0; i < n; i++) {
            q.add(students[i]);
        }
        int i = 0;
        while (sandwiches.length != i) {
            int val = sandwiches[i];
            if (q.contains(val) && val != q.peek()) {
                q.add(q.remove());
            } else if (q.contains(val) && val == q.peek()) {
                i++;
                q.remove();
            } else if (!q.contains(val)) {
                return q.size();
            }
        }
        return 0;
    }
}