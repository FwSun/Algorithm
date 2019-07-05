//将string反转
public class Solution {
    public String ReverseSentence(String str) {
       //要学会使用trim函数
       if(str.trim().equals("")||str==null) return str;
        String[] data = str.split(" ");
        String res = "";
        for(int i=data.length-1;i>=0;--i){
            res += data[i];
            if(i != 0)res += " ";
        }
        return res;
        
    }
}