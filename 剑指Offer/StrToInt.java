//将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，
//但是string不符合数字要求时返回0)，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0。
//解法1
import java.util.*;
public class Solution {
    public int StrToInt(String str) {
        if(str==null||str.trim().equals("")) return 0;
        char[] datas = str.toCharArray();
        char[] base = {'0','1','2','3','4','5','6','7','8','9'};
        //flag用于判断是否为负数 
        boolean flag = false;
        int index=0;
        ArrayList<Integer>num = new ArrayList<Integer>();
        //处理第一个字符可能是符号位的情况
        if(datas[0]=='-') {
            flag = true;
            index=1;
        }
        if(datas[0]=='+') index = 1;
        for(int i=index;i<datas.length;++i){
            if(datas[i]>='0'&&datas[i]<='9'){
                for(int j=0;j<base.length;++j){
                    if(base[j]==datas[i]) num.add(j);
                }
            }else return 0;
        }
        
        int ans = 0;
        for(int i=0;i<num.size();++i){
            ans = ans * 10+ num.get(i);
        }
        if(flag) ans = -ans;
        return ans;
        
    }
}

//解法2
public class Solution {
    public int StrToInt(String str) {
        if(str==null||str.trim().equals("")) return 0;
        boolean flag = false;
        int index=0;
        char[] data = str.toCharArray();
        if(data[0]=='-'){
            index=1;
            flag = true;
        }
        if(data[0]=='+') index=1;
        int ans = 0;
        for(int i=index;i<data.length;++i){
            if(data[i]<48||data[i]>57) return 0;
            else{
                //将‘1’转化为1
                ans = ans*10 + (data[i]-48);
            }
        }
        if(flag) return -ans;
        else return ans;
    }
}