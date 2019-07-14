   public String multiply(String num1, String num2) {
        StringBuilder out = new StringBuilder();
        int[] value=new int[num1.length()+num2.length()]; // 用于存储每位的数字
        char[] n1=num1.toCharArray();
        char[] n2=num2.toCharArray();
        for(int i=num1.length()-1;i>=0;i--){ // 每个位数相乘
            for(int j=num2.length()-1;j>=0;j--){
                value[i+j+1]+=Integer.parseInt(n1[i]+"")*Integer.parseInt(n2[j]+"");
                }
        }
        // 将两位数的数字的十位数移到下一位
        for(int i=value.length-1;i>=0;i--){
            if(value[i]>=10){
                int up=value[i]/10;
                value[i]=value[i]-up*10;
                value[i-1]+=up;
            }
        }
        //去除结果首部的0
        int sumZero = 0;
        for(int i=0;i<value.length;++i){
            if(value[i]==0)++sumZero;
            else break;
        }
        //如果乘机的结果为0，则返回0
        if(sumZero == value.length) return "0";
        //将结果转化为字符串
        for(int i=sumZero;i<value.length;++i){
            out.append(value[i]);
        }
        return out.toString();

        
    }