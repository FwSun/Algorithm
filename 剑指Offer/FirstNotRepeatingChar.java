import java.util.*;
public class Solution {
    public int FirstNotRepeatingChar(String str) {
        if(str==null) return -1;
        Map<Character,Integer>map = new HashMap<Character,Integer>();
        char[] data = str.toCharArray();
        //遍历字符数组，将每个字符出现的次数存入到map之中
        for(int i=0;i<data.length;++i){
            //注意这里的判断条件不能写int k = map.get(data[i]),这样会报空指针错
            //若map中无当前字符，则存入，次数为1
            if(map.get(data[i])==null) map.put(data[i],1);
            else{
                //若字符已存在map中，则次数+1
                int k = map.get(data[i]);
                map.put(data[i],k+1);
            }
        }
        //找出出现次数为1 的第一个字符
        for(int i=0;i<data.length;++i){
            if(map.get(data[i])==1) return i;
        }
        return -1;
    }
}