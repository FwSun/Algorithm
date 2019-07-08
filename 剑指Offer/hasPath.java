public class Solution {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        boolean flag[] = new boolean[rows*cols];
        for(int i=0;i<rows;++i){
            for(int j=0;j<cols;++j){
                if(helper(matrix,rows,i,cols,j,str,flag,0)==true) return true;
            }
        }
        return false;
    
    }
    public boolean helper(char[] matrix,int rows,int i,int cols,int j,char[] str,boolean[] flag,int k){
        //index代表的是当前元素在矩阵中的位置
        int index = i*cols+j;
        //数组越界，或者不等于当前的字符串或者当前的字符串已经访问过而不能重复访问则返回
        if(i<0||i>=rows||j<0||j>=cols||matrix[index]!=str[k]||flag[index]==true) return false;
        //当已经比较到最后一个字符时，则返回true
        if(k==str.length-1) return true;
        //代表当前元素已经访问
        flag[index]  = true;
        if(helper(matrix,rows,i-1,cols,j,str,flag,k+1)
          ||helper(matrix,rows,i+1,cols,j,str,flag,k+1)
          ||helper(matrix,rows,i,cols,j+1,str,flag,k+1)
          ||helper(matrix,rows,i,cols,j-1,str,flag,k+1)
          ) return true;
        
        flag[index] =  false;
        return false;
        
    }


}