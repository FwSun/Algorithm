//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
import java.util.*;
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        //map中存储的是数字，以及这个数出现的次数
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<array.length;++i){
            if(map.get(array[i])==null) map.put(array[i],1);
            else{
                int k = map.get(array[i]);
                map.put(array[i],k+1);
            }
        }
        //将结果存储到num1和num2中
        boolean flag = true;
        for(int i=0;i<array.length;++i){
            if(map.get(array[i])==1){
                if(flag){
                    num1[0] = array[i];
                    flag = false;
                } 
                else num2[0] = array[i];
            }
        }
        
    }
}