
/*

请实现一个函数用来找出字符流中第一个只出现一次的字符。
例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
*/
import java.util.*;
public class Solution {
    //Insert one char from stringstream
    //linkedHashMap保存了元素插入时的顺序
   Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
    public void Insert(char ch)
    {
        if(map.get(ch)==null) map.put(ch,1);
        else{
            int k = map.get(ch);
            map.put(ch,k+1);
        }
        
        
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        for(char c:map.keySet()){
            if(map.get(c)==1)return c;
        }
        return '#';
        
    
    }
}