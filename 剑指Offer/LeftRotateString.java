
/*
    题目：汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
    对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。例如，字符序列S=”abcXYZdef”,
    要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！

    解法：先反转前n个字符，再反转后面的字符，再将所有的字符反转即可
*/
public class Solution {
    public String LeftRotateString(String str,int n) {
        if(str==null||str.length()==0) return str;
        if(n>str.length()) return str;
        char[]data = str.toCharArray();
        reverse(data,0,n-1);
        reverse(data,n,data.length-1);
        reverse(data,0,data.length-1);
        return new String(data);
        
    }
    
    //将字符数组逆序的函数
    public void reverse(char[] data,int left,int right){
        int i = left, j = right;
        while(i<j){
            char tmp = data[i];
            data[i] = data[j];
            data[j] = tmp;
            --j;
            ++i;
        }
    }
}