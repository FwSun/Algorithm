public class Solution {
    //看到排序要条件反射的想到二分查找
    public int GetNumberOfK(int [] array , int k) {
        if(array==null || array.length<=0) return 0;
        int start = getFirst(array,0,array.length-1,k);
        int end = getLast(array,0,array.length-1,k);
        if(end != -1&&start != -1) return (end-start)+1;
        else return 0;
        
       
    }

    //查找数组里第一个等于目标的位置
    public int getFirst(int data[],int start,int end,int target){
        //递归出口
        int mid = (start+end)/2;
        while(start<=end){
            if(data[mid]<target) start = mid+1;
            else if(data[mid]>target) end = mid-1;
            else if(mid-1>=start&&data[mid-1]==target) end = mid-1;
            else return mid;
            mid = (start+end)/2;
        }
        return -1;
        
    }
    //查找数组中最后一个等于目标的位置
    public int getLast(int data[],int start,int end,int target){
          int mid = (start+end)/2;
        while(start<=end){
            if(data[mid]<target) start = mid+1;
            else if(data[mid]>target) end = mid-1;
            else if(mid+1<=end&&data[mid+1]==target) start = mid+1;
            else return mid;
            mid = (start+end)/2;
        }
        return -1;
        
        
    }
}