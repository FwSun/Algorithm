//给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
import java.util.ArrayList;
public class Solution {
    public int[] multiply(int[] A) {
        int len = A.length;
        if(len<=0) return A;
        int [] B= new int[len];
        
        //计算下三角的值
        B[0] = 1;
        for(int i=1;i<len;++i){//i代表的是B数组的下标
            B[i]  = B[i-1]*A[i-1];            
        }
        //将上三角的值乘到B数组中
        int temp = 1;
        for(int i=len-2;i>=0;--i){
            temp *= A[i+1];
            B[i] *= temp;
        }
        return B;
    }
}