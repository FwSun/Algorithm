/*
    思路：将整数按照顺序存储进ArrayList
    然后分配两个数组，一个存正序，一个存逆序。如果正序和逆序的顺序一样，那么这个数就是回文数
    */
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int normal[];
        int reverse[];
        List<Integer> list = new ArrayList<Integer>();

      
        while(x != 0){
            int t = x%10;
            x = x/10;
            list.add(t);
            
        }
        if(list.size()<=1)return true;
        normal = new int[list.size()];
        reverse = new int[list.size()];
        for(int i=0;i<list.size();++i){
            normal[i] = list.get(i);
        }
        //注意，此处reverse的下标不能用i表示，否则的话顺序就跟normal的一致了
        int j=0;
        for(int i=list.size()-1;i>=0;--i){
            reverse[j++] = list.get(i);
        }
        for(int i=0;i<list.size();++i){
            if(normal[i] != reverse[i]) return false;
        }
        return true;
        
        
    }