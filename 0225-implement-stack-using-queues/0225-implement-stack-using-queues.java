class MyStack {

    Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack() {
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }
    
    public void push(int x) {
        if(q1.isEmpty()){
            q1.add(x);
        }else{
            while(!q1.isEmpty()){
                q2.add(q1.remove());
            }
            q1.add(x);
            while(!q2.isEmpty()){
                q1.add(q2.remove());
            }
        }
    }
    
    public int pop() {
        if(q1.isEmpty()){
           return -1;
        }
        int val=q1.remove();
        return val;
    }
    
    public int top() {
        if(q1.isEmpty()){
           return -1;
        }
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */