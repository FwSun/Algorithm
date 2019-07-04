 //输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4
 import java.util.*;
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer>list = new ArrayList<Integer>();
        //当k大于数组本身的的长度时，直接返回空
        if(input.length<=0||k>input.length) return list;
        
        quickSort(input,0,input.length-1);
        for(int i=0;i<k;++i) list.add(input[i]);
        return list;
        
    }
    //快速排序
    public void quickSort(int []arr,int l,int r){
        //递归出口，一定不能忘，任何递归函数都必须要有递归出口
        if(l>r) return ;
        int temp = arr[l];
        int i=l,j=r;
        while(i<j){
            while(i<j&&arr[j]>temp)--j;
            if(i<j){
                arr[i] = arr[j];
                ++i;
            }
            while(i<j&&arr[i]<temp)++i;
            if(i<j){
                arr[j] = arr[i];
                --j;
            }
            
        }
        arr[i] = temp;
        quickSort(arr,l,i-1);
        quickSort(arr,i+1,r);
    }
}