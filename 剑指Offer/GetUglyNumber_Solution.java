//把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含质因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
import java.util.*;
public class Solution {
    public int GetUglyNumber_Solution(int index) {
        if(index<7) return index;
        //维持三个队列，每个队列存储的分别是2，3，5这三个原始丑数的倍数
        ArrayList<Integer>list2 = new ArrayList<Integer>();
        ArrayList<Integer>list3 = new ArrayList<Integer>();
        ArrayList<Integer>list5 = new ArrayList<Integer>();
        list2.add(2);
        list3.add(3);
        list5.add(5);
        int ans[] = new int[index];
        ans[0] = 1;
        for(int i=1;i<index;++i){
            int a = list2.get(0);
            int b = list3.get(0);
            int c = list5.get(0);
            //每次都取这三个队列里的第一个数中的最小值
            int t = min(a,b,c);
            ans[i] = t;
            //得到一个丑数后，将其分别乘以2，3，5，然后加入到三个队列
            list2.add(t*2);
            list3.add(t*3);
            list5.add(t*5);
            //移除已经加入到结果集的队列元素
           if(t==list2.get(0)) list2.remove(0);
            if(t==list3.get(0)) list3.remove(0);
            if(t==list5.get(0)) list5.remove(0);
            
        }
        
        
        
        return ans[index-1];
    }
    //找出三个数中的最小值
    public int min(int a,int b,int c){
        int t = a>b?b:a;
        return t>c?c:t;
    }
}