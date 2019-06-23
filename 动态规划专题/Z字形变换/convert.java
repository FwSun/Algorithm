//Z字形变换
    public String convert(String s, int numRows){
        if(numRows<=1) return s;
        //rows用来存储Z字形的每行字符数据
        List<StringBuilder>rows = new ArrayList<StringBuilder>();
        //Math.min(numRows,s.length)代表应该应该有多少行
        for(int i=0;i<Math.min(numRows,s.length());++i){
            rows.add(new StringBuilder());
        }
        boolean isDown = false;
        int currRow = 0;
        for(char c:s.toCharArray()){
            rows.get(currRow).append(c);
            if(currRow==0||currRow==numRows-1) isDown = !isDown;//改变方向
            currRow += isDown?1:-1;//改变rows
        }
        StringBuilder res = new StringBuilder();
        for(StringBuilder sb:rows){
            res.append(sb);
        }

        return res.toString();
    }