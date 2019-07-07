import java.util.*;

/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
//请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
public class Solution {
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>>ans = new ArrayList<ArrayList<Integer>>();
        if(pRoot==null) return ans;

        Stack<TreeNode> leftToRight = new Stack<TreeNode>();//从左开始打印的入此栈
        Stack<TreeNode> rightToLeft = new Stack<TreeNode>();//从右开始打印的如此栈
        leftToRight.push(pRoot);
        int layer = 1;
        while(!leftToRight.isEmpty() ||!rightToLeft.isEmpty()){
            if(layer % 2== 1){
                ArrayList<Integer> list = new ArrayList<Integer>();
                while(!leftToRight.isEmpty()){
                    TreeNode tmp = leftToRight.pop();
                    list.add(tmp.val);//存入到list中
                    //其孩子节点，即下一层节点存入到另一个stack中
                    if(tmp.left != null) rightToLeft.push(tmp.left);
                    if(tmp.right != null) rightToLeft.push(tmp.right);
                }
                if(list.size()>0) ans.add(list);
                ++layer;
            }else{
                ArrayList<Integer>list2 = new ArrayList<Integer>();
                while(!rightToLeft.isEmpty()){
                    TreeNode tmp2 = rightToLeft.pop();
                    list2.add(tmp2.val);
                    if(tmp2.right != null) leftToRight.push(tmp2.right);
                    if(tmp2.left != null) leftToRight.push(tmp2.left);
                }
                if(list2.size()>0) ans.add(list2);
                ++layer;
                
            }
        }
        return ans;
        

    }

}