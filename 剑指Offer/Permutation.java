//输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
import java.util.*;
public class Solution {
     ArrayList<String>list = new ArrayList<String>();
    public ArrayList<String> Permutation(String str) {       
        if(str==null) return list;
        char[]strs = str.toCharArray();
        ans(strs,0);
        //去除list中的重复元素
        HashSet<String> set = new HashSet<String>(list);
        list = new ArrayList<String>(set);
        //对去重后的list按照字典顺序排序
        Collections.sort(list);
        return list;
        
       
    }
    //递归方法
    public void ans(char[] strs,int start){
        if(start==strs.length-1){
            list.add(String.valueOf(strs));
            
        }else{
             //位于当前char数组的第一个元素依次于后面的元素进行交换
             for(int i=start;i<strs.length;++i){           
            swap(strs,start,i);
            ans(strs,start+1);
            swap(strs,start,i);
        }
            
        }
       
    }
    //交换char数组里元素的函数
    public void swap(char[]chars,int i,int j){
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
    
    
}