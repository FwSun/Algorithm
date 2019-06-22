 //stack1作为push的栈
    Stack<Integer> pushStack = new Stack<Integer>();
    //stack2作为pop的栈
    Stack<Integer> popStack = new Stack<Integer>();
    //入栈时只需将元素加入pushStack即可
    public void push(int node) {
        pushStack.push(node);
        
    }
    
    public int pop() {
        //pop时当popStack为空时需要将pushStack的元素全部搬运过来
        if(popStack.isEmpty()){
            while(!pushStack.isEmpty()){
                Integer k = pushStack.pop();
                popStack.push(k);
            }
            return popStack.pop();
        }else return popStack.pop();
    
    }