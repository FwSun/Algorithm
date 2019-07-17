class Solution {
    public int myAtoi(String str) {
        //trim()用来消除字符串首尾的空格，如果需要消除所有的空格可以用str.replace(" ","");
        str = str.trim();
        //处理字符串开头是空格的情况
        if(str.equals("")) return 0;
        boolean flag = false;
        boolean negative = false;
        char[] data = str.toCharArray();
        if(data[0]=='+'||data[0]=='-') {
            flag = true;
            if(data[0] == '-') negative = true;
            
        }
        //处理开头字符是否为符号
        int index = 0;
        if(flag) index = 1;
        //"-2147483649"
        //返回结果
        int ans = 0;
        for(int i=index;i<data.length;++i){
            char c = data[i];
            if(!(c>='0'&&c<='9')) return ans;
            int temp = c-48;
            if(negative) temp = -temp;
            //判断值是否以及越界
            if(ans>Integer.MAX_VALUE/10||ans == Integer.MAX_VALUE/10&&temp>7) return Integer.MAX_VALUE;
            if(ans<Integer.MIN_VALUE/10||ans==Integer.MIN_VALUE/10&&temp<-8) return Integer.MIN_VALUE;
            
            ans = ans *10 +temp;
        }
        
        return ans;
            
        
    }
}