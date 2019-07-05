import java.util.*;
//判断给定的扑克牌是否为顺子（包含可以充当任意牌的癞子）
//解题思路：将牌排序后，观察已有的癞子能否填充所有空洞
//注：若出现对子，则直接返回false
public class Solution {
    public boolean isContinuous(int [] numbers) {
        int numOfZero = 0;
        int sum = 0;
        int len = numbers.length;
        Arrays.sort(numbers);
        if(len<=0) return false;
        for(int i=0;i<len-1;++i){
            if(numbers[i]==0){
                ++numOfZero;
                continue;
            }else if(numbers[i]==numbers[i+1]) return false;
            else{
                sum += (numbers[i+1]-numbers[i]-1);
            }
            
        }
        if(numOfZero>=sum) return true;
        else return false;

    }
}