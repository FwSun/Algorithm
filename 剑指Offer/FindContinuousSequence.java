import java.util.ArrayList;
//和为某个数的连续数列
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
       if(sum<=0) return res;
       int left = 1,right=2;
        while(left<right){
            int all = (right+left)*(right-left+1)/2;
            if(all==sum){
                //找到符合条件的连续值
                ArrayList<Integer>list = new ArrayList<Integer>();
                for(int i=left;i<=right;++i) list.add(i);
                res.add(list);
                //继续向前探索
                ++left;
            }else if(all<sum)++right;
            else ++left;
        }
        return res;
    }
}