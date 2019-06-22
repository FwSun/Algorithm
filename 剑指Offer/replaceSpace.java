/*
题目：请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
解决思路：
    ①将StringBuilder转化为String
    ②将String转化为char数组 【char[] oldChars = s.toCharArray();】
    ③创建一个ArrayList用来记录替换过后的所有char元素
    ④循环遍历oldChars，遇到空格则在list里替换为%20
    ⑤将list里的元素转存到新的char数组newChars
    ⑥将newChars字符数组转化为String返回 【String s = new String(newChars)】

*/

public String replaceSpace(StringBuffer str) {
        //转化为字符串
        String s = str.toString();
        if(s==null||s=="") return null;
        if(s==" ") return "%20";
        //转化为字符数组
        char[] oldChars = s.toCharArray();
        //list用来保存替换后的所有char字符
        ArrayList<Character> list = new ArrayList<Character>();
        for(int i=0;i<oldChars.length;++i){

            if(oldChars[i]==' '){
                //遇到空格则替换
                list.add('%');
                list.add('2');
                list.add('0');
            }else {
                //不是空格则不变
                list.add(oldChars[i]);
            }
          
        }
        char[] newChars = new char[list.size()];
        //将list里的元素存入新的char数组
        for(int i=0;i<list.size();++i) newChars[i] = list.get(i);
        //char数组变为String
        String res = new String(newChars);
        return res;
    	
    }