   /*
    遇到左边符号则压入栈，遇到右边符号则弹出栈顶元素。判断弹出元素是否与左边元素成对
    注意switch的用法
    switch('a'){
        case 'a':print('a'); break;

    }
   */
    public boolean isValid(String s) {
        if(s==null) return true;
        Stack<Character> stack = new Stack<Character>();
        char[] chars = s.toCharArray();
        for(int i=0;i<chars.length;++i){
            if(chars[i]=='('||chars[i]=='['||chars[i]=='{')stack.push(chars[i]);
            else{
                if(stack.isEmpty()) return false;
                char ans = stack.pop();
                switch(chars[i]){
                case ')': if(ans !='(') return false; break;
                 case '}': if(ans !='{') return false; break;
                 case ']': if(ans !='[') return false; break;
                }
            }
        }
        if(stack.isEmpty()) return true;
        else return false;
        
    }