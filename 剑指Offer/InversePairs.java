public class Solution {
    int cnt;
    //实际上是归并排序的应用
    public int InversePairs(int [] array) {
        cnt = 0;
        if(array==null||array.length<=0) return 0;
        sort(array,0,array.length-1);
        return cnt;
    }
    
    
    
    //归并排序
    public void sort(int data[],int start,int end){
        //一i的那个不要忘记递归出口
        if(start>=end) return;
        int mid = (start+end)/2;
        sort(data,start,mid);
        sort(data,mid+1,end);
        merge(data,start,mid,end);
        
    }
    
    
    //合并两个有序数组成一个，合并过程中统计逆序数
    public void merge(int data[],int start,int mid,int end){
        int temp[] = new int[end-start+1];
        int i=start,j=mid+1;
        int k = 0;
        while(i<=mid&&j<=end){
            if(data[i]<=data[j]){
                temp[k++] = data[i];
                ++i;
            } 
            else{
                //核心：统计逆序的对数
                cnt += (mid-i+1);
                cnt%=1000000007;
                temp[k++] = data[j];
                ++j;
            }
        }
        while(i<=mid) temp[k++] = data[i++];
        while(j<=end) temp[k++] = data[j++];
       for( k=0;k<temp.length;++k){
           data[k+start] = temp[k];
       }
    }
}