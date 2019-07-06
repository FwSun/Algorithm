//寻找第一个重复的数字
import java.util.*;
public class Solution {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(length<=0) return false;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        //将每个数字和对应出现的次数存入到map中
        for(int i=0;i<length;++i){
            if(map.get(numbers[i])==null){
                map.put(numbers[i],1);
            }else{
                int k = map.get(numbers[i]);
                map.put(numbers[i],k+1);
            }
        }
        //寻找map中数字出现次数>=2的
        for(int i=0;i<length;++i){
            if(map.get(numbers[i])!=1){
                duplication[0] = numbers[i];
                return true;
            }
        }
        return false;
        
    
    }
}