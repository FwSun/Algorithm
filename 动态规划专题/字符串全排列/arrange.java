public class Solution{
    /**
    chars:待排列的字符串
    n:字符串的长度
    k:从第几个字符开始全排列

    算法思路（递归）：
    递归出口：如果是对字符串数组的最后一个字符进行往后排列的话，那么相当于不进行排列组合，打印整个顺序即可
    从待排列的字符串开始，往后的每个字符与其交换，交换后再对剩下的n-1个数进行全排列
    因为后面的字符串必须是与初始在第k个位置的那个字符进行交换，所以第①②步进行之后必须要把要保证第k个元素还是初始的那个值，所以再交换回来


    **/
  
    public void arrange(char[] chars,int n,int k){

            if(k==n-1){
                for(int j=0;j<chars.length;++j){
                    System.out.print(chars[j]+" ");
                }
                System.out.println();
            }else {
                for(int i=k;i<n;++i){
                    char tmp1 = chars[k]; chars[k] = chars[i]; chars[i] = tmp1;//交换
                    arrange(chars, n , k+1);//对剩下的n-1个数排列
                    char tmp2 = chars[k];chars[k] = chars[i];chars[i] = tmp2;//交换回来
                }

            }

    }
  
}