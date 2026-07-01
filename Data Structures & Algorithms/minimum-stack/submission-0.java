class MinStack {
    Stack<Integer> s ;
    public MinStack() {
        this.s = new Stack<>();
    }
    
    public void push(int val) {
        this.s.push(val);
    }
    
    public void pop() {
        //if(this.s.isEmpty()){
          //  return null;
       // }
        this.s.pop();
    }
    
    public int top() {
       
        return this.s.peek();
    }
    
    public int getMin() {
       // if(this.s.isEmpty()){
          //  return null;
        //}
        int min = Integer.MAX_VALUE;
        for(int i:this.s){
            min = Math.min(min,i);
        }
        return min;
    }
}
