/*利用滑动窗口解决问题
    窗口内始终维持0的个数为K，max记录所有窗口滑动过程中出现的1
    的最大个数

*/
class Solution {
    public int longestOnes(int[] A, int K) {
        if(A==null||A.length<=0) return 0;
        //窗口两侧
        int left = 0,right = 0;
        int max = 0;
        //0的个数
        int count = 0;
        while(right<A.length){
            if(A[right]==0) ++count;
            //当窗口内的0个数大于K时，移动左边的窗口，将多余的0移除窗口
            if(count>K){
                while(count>K){
                    if(A[left]==0) --count;
                    ++left;
                }
                
            }
            //记录窗口移动过程中出现的最大长度
            max = Math.max(right-left+1,max);
            ++right;
        }
        return max;
    }
}