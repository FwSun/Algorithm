//求一列数组的最大连续和
public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        //保存最大值
        int max = array[0];
        //前面数的累计和
        int preSum = array[0];
        for(int i=1;i<array.length;++i){
            //当preSUm为正时
            if(preSum>0) preSum += array[i];
            //preSum为负数
            else preSum = array[i];
            if(preSum > max) max = preSum;
            
            
        }
        return max;
        
    }
}