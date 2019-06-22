//输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。

public int NumberOf1(int n) {
        if(n==0) return 0;
        int count=0;
        int temp = 1;
        //这里循环结束的条件不能是temp>0,因为当temp中的1左移到最左边时，此时1是符号位，故temp<0。但此时循环还有最后一次，不能结束
        while(temp != 0){
        	//将n与temp做&运算，当n当前位不是0时，两数&的结果!=0,注意，只有第一次&的时候值才为1
            if((n&temp)!=0) ++count;
            temp = temp<<1;
        }
        return count;
    }