//约瑟夫杯的问题
//解答：https://blog.csdn.net/u011500062/article/details/72855826
//解答实际运用了动态规划的知识，状态转移公式为 f(n,m) = (f(n-1,m)+m)%n ;
public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        if(n<=0||m<=0) return -1;
        int p=0;
        for(int i=2;i<=n;++i){
            p = (p+m)%i;
        }
        
        return p;
    }
}